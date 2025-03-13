package lnd.sample.jasypt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lnd.sample.jasypt.model.entity.User;

@Repository
public interface UserRepos extends JpaRepository<User, Long> {
}
