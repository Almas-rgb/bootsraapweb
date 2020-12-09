package com.webaptstor.demo.Repositories;

import kz.webtodolist.v1.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {


}
