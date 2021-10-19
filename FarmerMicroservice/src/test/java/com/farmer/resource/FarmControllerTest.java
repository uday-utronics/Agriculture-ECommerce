package com.farmer.resource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.farmer.model.FarmUser;
import com.farmer.repository.FarmUserRepository;

@RunWith(MockitoJUnitRunner.class)
class FarmControllerTest {

	@InjectMocks
	FarmController farmcontroller;
	@Mock
	FarmUserRepository farmUserRepository;
	@Mock
	FarmUserService farmUserService;
	
	
	//MockitoAnnotations.initMocks().
	//This method also, upon initialization of junit tests, initializes the mock objects.
	@BeforeEach
	void setup()
	{
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testGetAll() {
		
		//given
		FarmUser farmer1= new FarmUser();
		FarmUser farmer2= new FarmUser();
		List<FarmUser> users = new ArrayList<FarmUser>();
		users.add(farmer1);
		users.add(farmer2);
		when(farmUserRepository.findAll()).thenReturn(users);
		
		//when
		List<FarmUser> result= farmcontroller.getAll();
		
		//then
		Assertions.assertEquals(result.size(), 2);
	}

	@Test
	void testGetfarmer() {
		FarmUser farmer1= new FarmUser();
		farmer1.setFarmerName("Farmer1");
		when(farmUserService.getByUsername(farmer1.getFarmerName())).thenReturn(farmer1);
		FarmUser farmer2 = farmcontroller.getUsers(farmer1.getFarmerName());
		Assertions.assertEquals("Farmer1", farmer2.getFarmerName());
	}
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
//	@Test
//	void testCreate() {
//		fail("Not yet implemented");
//	}


}
