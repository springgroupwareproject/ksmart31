package ksmart31.team01.member.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberAcademy;
import ksmart31.team01.member.mapper.MemberMyAcademyMapper;

@Service
@Transactional
public class MemberMyAcademyService {

	@Autowired private MemberMyAcademyMapper memberMyAcademyMapper;
	
	public void insertMyacademy(HttpSession session, MemberAcademy memberAcademy) {
		System.out.println("나의 교육 이력 입력 실행");
		
		Member member = (Member) session.getAttribute("loginMember");  // member = 아이디,사번,조직원이름,부서명,직위직책,
		
		
	
	
		memberMyAcademyMapper.insertMyacademy(memberAcademy);
	}
	
	/*	// 글 & 파일 등록
	public void addBoard(BoardRequest boardRequest) {
		System.out.println("BoardService.addBoard boardRequest : "+boardRequest);
		Board board = new Board();
		board.setBoardTitle(boardRequest.getBoardTitle());
		board.setBoardContent(boardRequest.getBoardContent());
		board.setBoardPw(boardRequest.getBoardPw());
		board.setBoardUser(boardRequest.getBoardUser());
		boardMapper.insertBoard(board);
		
		List<MultipartFile> multipartFileList = boardRequest.getBoardFile();
		System.out.println("BoardService.addBoard multipartFileList : "+multipartFileList);
		if(multipartFileList.size() != 0) {
		for(MultipartFile multipartFile : multipartFileList) {
		String originalFileName = multipartFile.getOriginalFilename();
		int i = originalFileName.lastIndexOf(".");
		String originName = originalFileName.substring(0, i);
		String ext = originalFileName.substring(i+1).toLowerCase();
		UUID uuid = UUID.randomUUID();
		String saveName = uuid.toString().replace("-", "");
		
		BoardFile boardFile = new BoardFile();
		boardFile.setBoardNo(board.getBoardNo());
		boardFile.setBoardFileOriginName(originName);
		boardFile.setBoardFileSaveName(saveName);
		boardFile.setBoardFileExt(ext);
		boardFile.setBoardFileSize(multipartFile.getSize());
		boardFile.setBoardFileType(multipartFile.getContentType());
		System.out.println("BoardService.addBoard boardFile : "+boardFile);
		// 3. 폴더에 저장
		File file = new File(PathConstant.UPLOAD_PATH+"/"+saveName+"."+ext); // 빈파일
		try {
			multipartFile.transferTo(file);
			} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
			}
			boardFileMapper.insertBoardFile(boardFile);
		}
		}
	}
	*/
	
	
	public List<MemberAcademy> myAcatemy(String memberId) {
		System.out.println("MemberMyAcademyService memberId : " + memberId);
		
		List<MemberAcademy> myAcatemy = memberMyAcademyMapper.myAcademy(memberId);
		System.out.println("MemberMyEducationService - myEducation : " + myAcatemy);
		
		return myAcatemy;
	}

}
