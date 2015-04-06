package com.eas.service;

import com.eas.domain.Device;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeviceService {
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
    List<Device> getList(long userId, int pageIndex, int pageSize);

    /**
     * 得到用户的所有设备总数
     *
     * @return
     */
    Long getCount(long userId);
}
