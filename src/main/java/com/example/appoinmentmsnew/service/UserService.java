package com.example.appoinmentmsnew.service;

import com.example.appoinmentmsnew.dto.UserDTO;
import com.example.appoinmentmsnew.entity.User;
import com.example.appoinmentmsnew.repo.UserRepo;
import com.example.appoinmentmsnew.util.VarList;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public String saveUser(UserDTO userDTO){
        if(userRepo.existsById(userDTO.getUserId())){
            return VarList.RSP_DUPLICATED;
        }else{
          userRepo.save(modelMapper.map(userDTO, User.class));
          return VarList.RSP_SUCCESS;
        }
    }
}
