package com.sunjoy.trm.bizcore.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjoy.framework.dao.paging.Page;
import com.sunjoy.trm.bizcore.dao.criteria.RegistionCriteria;
import com.sunjoy.trm.bizcore.dao.entity.Registion;
import com.sunjoy.trm.bizcore.service.IRegistionService;

/**
 * 课程注册服务实现类
 * @author liuganchao<740033486@qq.com>
 * @date 2018年6月27日
 */
@Service(value="registionService")
@Transactional
public class RegistionServiceImpl implements IRegistionService{

	@Override
	public Page<Registion> queryByPage(RegistionCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Registion> query(RegistionCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Registion update(Registion student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Registion add(Registion student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Registion get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
