/**
 * 
 */
package br.com.geovan.dao;

import br.com.geovan.model.Curriculo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author geovan.goes
 *
 */
@Repository
public interface CurriculoRepository extends CrudRepository<Curriculo, Long>
{
}
