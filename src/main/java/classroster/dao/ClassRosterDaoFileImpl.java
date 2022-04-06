/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroster.dao;

import classroster.dto.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author harle
 */
public class ClassRosterDaoFileImpl implements ClassRosterDao {

    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    private Map<String, Student> students = new HashMap<>();

    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterDaoException {
        
        Student newStudent = students.put(studentId, student);
        
        return newStudent;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterDaoException {
       
        return new ArrayList(students.values());
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterDaoException {
        
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterDaoException {
       
        Student removedStudent = students.remove(studentId);
      
        return removedStudent;
    }

   
}
