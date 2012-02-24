package com.occupytheserver.demo.etrm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.occupytheserver.demo.etrm.repository.object.CommodityTypeDTO;


public interface CommodityTypeRepository extends JpaRepository<CommodityTypeDTO, String> {
	
	//@Query("select ct from CommodityTypeDTO ct where ct.commodityTypeName like ?1")
	//List<CommodityTypeDTO> search(String firstName);

}
