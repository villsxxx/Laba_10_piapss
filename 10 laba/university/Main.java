package university;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== University System ===");

        // Создаем университет
        University university = new University("VSU");

        // Создаем факультет
        Faculty faculty = new Faculty("FKN");

        // Изменённая информация о декане
        Dean dean = new Dean(112233, "Sidorova A.N.", "sidorova@vsu.ru");
        faculty.setDean(dean);

        // Создаем институт
        Institute institute = new Institute("Software Engineering", "Main Street");

        // Изменённая информация о преподавателе
        Lecturer lecturer = new Lecturer(445566, "Smirnov D.V.", "smirnov@vsu.ru", "Artificial Intelligence");
        // Теперь у него другое имя и поле изучения

        // Создаем курс
        Course course = new Course("Java Programming", 101, 60.0f);
        course.setLecturer(lecturer);
        lecturer.addCourse(course);

        // Создаем проект
        Project project = new Project("AI Research", new Date(), new Date());

        // Создаем участие
        Participation participation = new Participation(lecturer, project, 120);

        // Связываем все вместе
        institute.addResearchAssociate(lecturer);
        lecturer.addParticipation(participation);

        faculty.addInstitute(institute);
        university.addFaculty(faculty);

        // Выводим данные в консоль
        System.out.println("University: " + university.getName());
        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Dean: " + faculty.getDean().getName() + " (" + faculty.getDean().getEmail() + ")");
        System.out.println("Institute: " + institute.getName());
        System.out.println("Lecturer: " + lecturer.getName() + ", Field: " + lecturer.getFieldOfStudy());
        System.out.println("Course: " + course.getName() + " (ID: " + course.getId() + ")");
        System.out.println("Project: " + project.getName());
        System.out.println("Participation hours: " + participation.getHours());
    }
}