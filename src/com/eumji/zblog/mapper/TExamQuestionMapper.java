package com.eumji.zblog.mapper;

import com.eumji.zblog.vo.TExamQuestion;
import com.eumji.zblog.vo.TExamQuestionExample;
import com.eumji.zblog.vo.TExamQuestionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExamQuestionMapper {
    int countByExample(TExamQuestionExample example);

    int deleteByExample(TExamQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TExamQuestionWithBLOBs record);

    int insertSelective(TExamQuestionWithBLOBs record);

    List<TExamQuestionWithBLOBs> selectByExampleWithBLOBs(TExamQuestionExample example);

    List<TExamQuestion> selectByExample(TExamQuestionExample example);

    TExamQuestionWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TExamQuestionWithBLOBs record, @Param("example") TExamQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") TExamQuestionWithBLOBs record, @Param("example") TExamQuestionExample example);

    int updateByExample(@Param("record") TExamQuestion record, @Param("example") TExamQuestionExample example);

    int updateByPrimaryKeySelective(TExamQuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TExamQuestionWithBLOBs record);

    int updateByPrimaryKey(TExamQuestion record);
}