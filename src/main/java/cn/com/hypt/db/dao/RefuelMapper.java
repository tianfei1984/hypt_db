package cn.com.hypt.db.dao;

import cn.com.hypt.db.model.Refuel;
import cn.com.hypt.db.model.RefuelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefuelMapper {
    int countByExample(RefuelExample example);

    int deleteByExample(RefuelExample example);

    int deleteByPrimaryKey(Integer refuelId);

    int insert(Refuel record);

    int insertSelective(Refuel record);

    List<Refuel> selectByExample(RefuelExample example);

    Refuel selectByPrimaryKey(Integer refuelId);

    int updateByExampleSelective(@Param("record") Refuel record, @Param("example") RefuelExample example);

    int updateByExample(@Param("record") Refuel record, @Param("example") RefuelExample example);

    int updateByPrimaryKeySelective(Refuel record);

    int updateByPrimaryKey(Refuel record);
}