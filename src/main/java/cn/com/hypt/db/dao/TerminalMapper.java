package cn.com.hypt.db.dao;

import cn.com.hypt.db.model.Terminal;
import cn.com.hypt.db.model.TerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalMapper {
    int countByExample(TerminalExample example);

    int deleteByExample(TerminalExample example);

    int deleteByPrimaryKey(Integer terminalId);

    int insert(Terminal record);

    int insertSelective(Terminal record);

    List<Terminal> selectByExample(TerminalExample example);

    Terminal selectByPrimaryKey(Integer terminalId);

    int updateByExampleSelective(@Param("record") Terminal record, @Param("example") TerminalExample example);

    int updateByExample(@Param("record") Terminal record, @Param("example") TerminalExample example);

    int updateByPrimaryKeySelective(Terminal record);

    int updateByPrimaryKey(Terminal record);
}