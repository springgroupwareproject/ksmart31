package ksmart31.team01.member.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.files.mapper.FilesMapper;
import ksmart31.team01.member.domain.Member;
import ksmart31.team01.member.domain.MemberAcademy;
import ksmart31.team01.member.mapper.MemberMyAcademyMapper;

@Service
@Transactional
public class MemberMyAcademyService {

	@Autowired private MemberMyAcademyMapper memberMyAcademyMapper;
	@Autowired private FilesMapper filesMapper;
	
	public void insertMyacademy(HttpSession session, MemberAcademy memberAcademy /* , MemberFiles memberFiles */) {
		System.out.println("나의 교육 이력 입력 실행");


		Member member = (Member) session.getAttribute("loginMember");  // member = 아이디,사번,조직원이름,부서명,직위직책,
		memberAcademy.setMemberId(member.getMemberId());
		memberAcademy.setMemberEmployeeCode(member.getMemberEmployeeCode());
		memberAcademy.setMemberName(member.getMemberName());
		memberAcademy.setDepartmentName(member.getDepartmentName());
		memberAcademy.setMemberPositionName(member.getMemberPositionName());
		
		System.out.println("MemberMyAcademyService.insertMyacademy() 입력되는 나의 교육 값 : " + memberAcademy);
		
		/* 파일업로드
		 * memberFiles.setMemberId(member.getMemberId());
		memberFiles.setMemberEmployeeCode(member.getMemberEmployeeCode());
		memberFiles.setMemberName(member.getMemberName());
		memberFiles.setDepartmentName(member.getDepartmentName());
		memberFiles.setMemberPositionName(member.getMemberPositionName());	
			
		System.out.println("파일테이블 입력값 출력 : " + memberFiles);
		
		int returnResult = filesMapper.insertFiles(memberFiles);
		if(returnResult == 0) {
			System.out.println("ksmart31.team01.files.service.filesService 파일 첨부 실패 (쿼리문실패) 리턴int : " + returnResult);
		} else {
			System.out.println("ksmart31.team01.files.service.filesService 파일 첨부 성공 (쿼리문성공) 리턴int : " + returnResult);
		}
		*/
		
		
		// 쿼리문 실행 결과 리턴 int값 으로 성공여부 확인
		int result= memberMyAcademyMapper.insertMyacademy(memberAcademy);
		
		if(result != 0) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
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
