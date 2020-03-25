/**
 * 
 */
package com.hcl.project.accountmanagement.AccountMain.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.project.accountmanagement.AccountMain.entity.AccountEntity;

/**
 * @author Sweta
 *
 */
@Repository
public interface AccountRepository  extends JpaRepository<AccountEntity, Long>  {

}
