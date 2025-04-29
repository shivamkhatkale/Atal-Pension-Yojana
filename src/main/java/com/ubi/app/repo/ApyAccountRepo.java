package com.ubi.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubi.app.entity.CbsData;
import com.ubi.app.entity.SaveApy;

public interface ApyAccountRepo extends JpaRepository<SaveApy, Integer> {

	void saveAll(List<CbsData> customers);

}
