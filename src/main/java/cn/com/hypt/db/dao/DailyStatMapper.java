package cn.com.hypt.db.dao;

import cn.com.hypt.db.model.DailyStat;
import cn.com.hypt.db.model.DailyStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyStatMapper {
    int countByExample(DailyStatExample example);

    int deleteByExample(DailyStatExample example);

    int deleteByPrimaryKey(Integer dailyStatId);

    int insert(DailyStat record);

    int insertSelective(DailyStat record);

    List<DailyStat> selectByExample(DailyStatExample example);

    DailyStat selectByPrimaryKey(Integer dailyStatId);

    int updateByExampleSelective(@Param("record") DailyStat record, @Param("example") DailyStatExample example);

    int updateByExample(@Param("record") DailyStat record, @Param("example") DailyStatExample example);

    int updateByPrimaryKeySelective(DailyStat record);

    int updateByPrimaryKey(DailyStat record);
}