/**
 * 
 */
package br.com.goes.curriculo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.goes.curriculo.model.Curriculo;

/**
 * @author geovan.goes
 *
 */
@Repository
public interface CurriculoRepository extends CrudRepository<Curriculo, Long>
{
}
