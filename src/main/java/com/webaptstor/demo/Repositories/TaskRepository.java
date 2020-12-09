package com.webaptstor.demo.Repositories;

import kz.webtodolist.v1.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {


}
