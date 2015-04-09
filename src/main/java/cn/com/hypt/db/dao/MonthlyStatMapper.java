package cn.com.hypt.db.dao;

import cn.com.hypt.db.model.MonthlyStat;
import cn.com.hypt.db.model.MonthlyStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthlyStatMapper {
    int countByExample(MonthlyStatExample example);

    int deleteByExample(MonthlyStatExample example);

    int deleteByPrimaryKey(Integer jtMonthlyStatId);

    int insert(MonthlyStat record);

    int insertSelective(MonthlyStat record);

    List<MonthlyStat> selectByExample(MonthlyStatExample example);

    MonthlyStat selectByPrimaryKey(Integer jtMonthlyStatId);

    int updateByExampleSelective(@Param("record") MonthlyStat record, @Param("example") MonthlyStatExample example);

    int updateByExample(@Param("record") MonthlyStat record, @Param("example") MonthlyStatExample example);

    int updateByPrimaryKeySelective(MonthlyStat record);

    int updateByPrimaryKey(MonthlyStat record);
}