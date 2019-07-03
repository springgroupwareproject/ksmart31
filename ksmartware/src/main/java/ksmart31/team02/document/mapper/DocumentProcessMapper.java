package ksmart31.team02.document.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.domain.ApprovalProcess;

@Mapper
public interface DocumentProcessMapper {
	// 관리자 결재선 관리, 사용자 결재선 목록 불러오기
	public List<ApprovalProcess> selectApprovalProcess();
}
