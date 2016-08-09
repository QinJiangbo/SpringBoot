package com.qinjiangbo.repository;

import com.qinjiangbo.model.SysUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Richard on 7/16/16.
 */
@Repository
@Transactional
public interface SysUserRepo extends PagingAndSortingRepository<SysUser, Long> {

    List<SysUser> findByAcEmail(String acEmail);

    SysUser findOne(Long userId);

    List<SysUser> findByAcEmailIn(List<String> acEmails);

    int deleteByAcEmail(String acEmail);



}
