package com.zhl.custommybatis.database.cramapper;

import com.zhl.custommybatis.database.model.RemiCraClaimInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Description:
 *
 * @author fanxuemei [fanxuemei@sinosoft.com.cn]
 * date: 2020-09-28 14:55
 */
@Repository
public interface ICraDao {

    /**
     * 查询cra 视图
     *
     * @param param param
     *
     * @return list
     *
     * @author fanxuemei
     * date 2020-09-30 09:31
     */
    List<LinkedHashMap<String,Object>> findRemiCraCilaiInfoList(RemiCraClaimInfo param);

    /**
     * 查询视图数量
     *
     * @param param param
     *
     * @return int
     *
     * @author fanxuemei
     * date 2020-11-01 18:53
     */
    Integer findRemiCraCilaiInfoCount(RemiCraClaimInfo param);

    /**
     * 查询cra 视图
     *
     * @param param param
     *
     * @return list
     *
     * @author fanxuemei
     * date 2020-10-21 09:25
     */
    List<RemiCraClaimInfo> findRemiCraClaimInfoList(RemiCraClaimInfo param);
}
