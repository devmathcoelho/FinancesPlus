package com.financeplus.Server.repository;

import com.financeplus.Server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>
{

}
