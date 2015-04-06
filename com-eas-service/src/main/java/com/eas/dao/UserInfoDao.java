package com.eas.dao;

import com.eas.domain.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户-用户信息Dao
 */


@Repository
@Transactional
public interface UserInfoDao {

    /**
     * 添加记录
     *
     * @param userInfo
     * @return
     */
    Integer add(UserInfo userInfo);

    /**
     * 根据Id查询用户账号信息
     *
     * @param id
     * @return
     */
    UserInfo getById(long id);

    /**
     * 根据登录名查找
     *
     * @param loginName
     * @return
     */
    UserInfo getByLoginName(String loginName);

    /**
     * @param loginName
     * @return
     */
    UserInfo getByLoginNameAndPassword(@Param("loginName") String loginName, @Param("password") String password);

    /**
     * 更新
     *
     * @param userInfo
     * @return
     */
    int update(UserInfo userInfo);

    /**
     * 根据Id删除用户账号信息
     *
     * @param id
     * @return
     */
    int deleteById(long id);
}
