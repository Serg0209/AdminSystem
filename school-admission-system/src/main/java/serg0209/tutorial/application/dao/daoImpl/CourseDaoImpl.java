package serg0209.tutorial.application.dao.daoImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import serg0209.tutorial.application.dao.CourseDao;
import serg0209.tutorial.application.domain.Course;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service("courseDao")
@Transactional
public class CourseDaoImpl implements CourseDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Course> loadCourse() {
        Query query = entityManager.createQuery("FROM Course c order by c.name ASC");
        return query.getResultList();
    }

    public String loadCourse(int id) {
        List<Course> courseList = (List<Course>) entityManager.createQuery("FROM Course c WHERE c.id=" + id).getResultList();
        for (Course c : courseList) {
            return (String) c.getName();
        }
        return "";
    }

    public List<Course> findCourse(int id) {
        return entityManager.createQuery("FROM Course c WHERE c.id=" + id).getResultList();
    }
}