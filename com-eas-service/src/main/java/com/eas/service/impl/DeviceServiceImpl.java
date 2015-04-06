package com.eas.service.impl;

import com.eas.dao.DeviceDao;
import com.eas.domain.Device;
import com.eas.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("deviceService")
public class DeviceServiceImpl extends ServiceBase implements DeviceService {

    @Autowired
    private DeviceDao deviceDao;

    @Override
    public Long add(Device device) {
        long id = GenerateId();
        device.setId(id);
        Date nowDate = new Date();
        device.setCreatedTime(nowDate);
        device.setLastUpdatedTime(nowDate);
        Long ret = deviceDao.add(device);
        if (ret > 0) {
            return id;
        }
        return 0L;
    }

    @Override
    public List<Device> getList(long userId, int pageIndex, int pageSize) {
        List<Device> deviceList = deviceDao.getList(userId, (pageIndex - 1) * pageSize, pageSize);
        return deviceList;
    }

    @Override
    public Long getCount(long userId) {
        return deviceDao.getCount(userId);
    }
}
