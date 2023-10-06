package uk.ng85.modules.persistence.jpa;

import uk.ng85.modules.persistence.jpa.model.RepositoryException;
import uk.ng85.modules.persistence.jpa.model.entity.GenericEntity;
import uk.ng85.modules.persistence.jpa.model.query.QueryFilter;
import uk.ng85.modules.persistence.jpa.model.query.QueryJoinFields;
import uk.ng85.modules.persistence.jpa.model.query.QueryResultPagination;
import uk.ng85.modules.persistence.jpa.model.query.QueryResultSorting;

import java.util.List;

/**
 * @author Nebojsa Gajic
 */
public interface GenericRepository {

    <E extends GenericEntity<I>, I> I create(E entity) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<I> create(List<E> entities) throws RepositoryException;

    <E extends GenericEntity<I>, I> void delete(E entity) throws RepositoryException;

    <E extends GenericEntity<I>, I> void delete(Class<E> entityType,
                                                List<QueryFilter> filters) throws RepositoryException;

    <E extends GenericEntity<I>, I> void deleteByIdentifier(Class<E> entityType,
                                                            I identifier) throws RepositoryException;

    <E extends GenericEntity<I>, I> void deleteByIdentifiers(Class<E> entityType,
                                                             List<I> identifiers) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findByIdentifier(Class<E> entityType,
                                                       I identifier) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findByIdentifier(Class<E> entityType,
                                                       I identifier,
                                                       List<String> joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findByIdentifier(Class<E> entityType,
                                                       I identifier,
                                                       QueryJoinFields joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<E> findByIdentifiers(Class<E> entityType,
                                                              List<I> identifiers) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<E> findByIdentifiers(Class<E> entityType,
                                                              List<I> identifiers,
                                                              List<String> joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> List<E> findByIdentifiers(Class<E> entityType,
                                                              List<I> identifiers,
                                                              QueryJoinFields joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findByUniqueProperty(Class<E> entityType,
                                                           String propertyName,
                                                           String propertyValue) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findByUniqueProperty(Class<E> entityType,
                                                           String propertyName,
                                                           String propertyValue,
                                                           List<String> joinFields) throws RepositoryException;

    <E extends GenericEntity<I>, I> E findByUniqueProperty(Class<E> entityType,
                                                           String propertyName,
                                                           String propertyValue,
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

    <E extends GenericEntity<I>, I> Long totalCount(Class<E> entityType) throws RepositoryException;

    <E extends GenericEntity<I>, I> Long totalCount(Class<E> entityType,
                                                    List<QueryFilter> filters) throws RepositoryException;

    <E extends GenericEntity<I>, I> void update(E entity) throws RepositoryException;

    <E extends GenericEntity<I>, I> void update(List<E> entities) throws RepositoryException;

}