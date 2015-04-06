package com.eas.dao;

import com.eas.domain.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by RayLew on 2015/2/4.
 * QQ:897929321
 */
public interface DeviceDao {
    /**
     * 添加设备
     *
     * @param device
     * @return
     */
    Long add(Device device);

    /**
     * 得到用户的所有设备
     *
     * @return
     */
    List<Device> getList(@Param("uid") long uid, @Param("offset") int offset, @Param("size") int size);

    /**
     * 得到用户的所有设备总数
     *
     * @return
     */
    Long getCount(@Param("uid") long uid);
}
