package uk.ng85.modules.persistence.api;

import uk.ng85.modules.persistence.api.model.RepositoryException;
import uk.ng85.modules.persistence.api.model.entity.GenericEntity;
import uk.ng85.modules.persistence.api.model.query.QueryFilter;
import uk.ng85.modules.persistence.api.model.query.QueryJoinFields;
import uk.ng85.modules.persistence.api.model.query.QueryResultPagination;
import uk.ng85.modules.persistence.api.model.query.QueryResultSorting;

import java.util.List;
import java.util.Map;

/**
 * @author Nebojsa Gajic
 */
public interface GenericRepository {

    <E extends GenericEntity<I>, I> I create(E entity) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<I> create(List<E> entities) throws RepositoryException;

    <E extends GenericEntity<I>, I> void delete(E entity) throws RepositoryException;

    <E extends GenericEntity<I>, I> void delete(Class<E> entityType,
                                                List<QueryFilter> filters) throws RepositoryException;

    <E extends GenericEntity<I>, I> void deleteById(Class<E> entityType,
                                                    I id) throws RepositoryException;

    <E extends GenericEntity<I>, I> void deleteByIds(Class<E> entityType,
                                                     List<I> ids) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findById(Class<E> entityType,
                                               I id) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findById(Class<E> entityType,
                                               I id,
                                               List<String> joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findById(Class<E> entityType,
                                               I id,
                                               QueryJoinFields joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<E> findByIds(Class<E> entityType,
                                                      List<I> ids) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<E> findByIds(Class<E> entityType,
                                                      List<I> ids,
                                                      List<String> joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<E> findByIds(Class<E> entityType,
                                                      List<I> ids,
                                                      QueryJoinFields joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findByUniqueProperty(Class<E> entityType,
                                                           String propertyName,
                                                           Object propertyValue) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findByUniqueProperty(Class<E> entityType,
                                                           String propertyName,
                                                           Object propertyValue,
                                                           List<String> joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findByUniqueProperty(Class<E> entityType,
                                                           String propertyName,
                                                           Object propertyValue,
                                                           QueryJoinFields joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<E> list(Class<E> entityType,
                                                 List<QueryFilter> filters,
                                                 QueryResultPagination pagination,
                                                 List<QueryResultSorting> sorting) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<E> list(Class<E> entityType,
                                                 List<QueryFilter> filters,
                                                 QueryResultPagination pagination,
                                                 List<QueryResultSorting> sorting,
                                                 List<String> joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<E> list(Class<E> entityType,
                                                 List<QueryFilter> filters,
                                                 QueryResultPagination pagination,
                                                 List<QueryResultSorting> sorting,
                                                 QueryJoinFields joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<I> listIds(Class<E> entityType,
                                                   List<QueryFilter> filters,
                                                   QueryResultPagination pagination,
                                                   List<QueryResultSorting> sorting) throws RepositoryException;

    <E extends GenericEntity<I>, I> Long totalCount(Class<E> entityType) throws RepositoryException;

    <E extends GenericEntity<I>, I> Long totalCount(Class<E> entityType,
                                                    List<QueryFilter> filters) throws RepositoryException;

    <E extends GenericEntity<I>, I> Map<I, Long> totalCountGroupedBy(Class<E> entityType,
                                                                     Class<I> propertyType,
                                                                     String propertyName) throws RepositoryException;

    <E extends GenericEntity<I>, I> Map<I, Long> totalCountGroupedBy(Class<E> entityType,
                                                                     List<QueryFilter> filters,
                                                                     Class<I> propertyType,
                                                                     String propertyName) throws RepositoryException;

    <E extends GenericEntity<I>, I> void update(E entity) throws RepositoryException;

    <E extends GenericEntity<I>, I> void update(List<E> entities) throws RepositoryException;

    <E extends GenericEntity<I>, I> void updateProperty(Class<E> entityType,
                                                        String propertyName,
                                                        Object propertyValue) throws RepositoryException;

    <E extends GenericEntity<I>, I> void updateProperties(Class<E> entityType,
                                                          Map<String, Object> properties) throws RepositoryException;

    <E extends GenericEntity<I>, I> void updateProperty(Class<E> entityType,
                                                        List<QueryFilter> filters,
                                                        String propertyName,
                                                        Object propertyValue) throws RepositoryException;

    <E extends GenericEntity<I>, I> void updateProperties(Class<E> entityType,
                                                          List<QueryFilter> filters,
                                                          Map<String, Object> properties) throws RepositoryException;

}