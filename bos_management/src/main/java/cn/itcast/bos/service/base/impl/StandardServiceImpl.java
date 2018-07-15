package cn.itcast.bos.service.base.impl;

import cn.itcast.bos.dao.base.StandardRepository;
import cn.itcast.bos.domain.base.Standard;
import cn.itcast.bos.service.base.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StandardServiceImpl implements StandardService{

  //注入DAO
  @Autowired
  private StandardRepository standardRepository;

  @Override
  public void save(Standard standard) {
    //调用DAO执行保存方法
    standardRepository.save(standard);
  }
}
