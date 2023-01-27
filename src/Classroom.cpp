#include "Classroom.h"

Classroom::Classroom(Teacher myteacher){
    classroomId = time(0) + randint(-10, 10);;
    teacher = myteacher;
}

Classroom::Classroom(int myid, Teacher myteacher){
    classroomId = myid;
    teacher = myteacher;
}

void Classroom::addStudent(Student* student){
    studentList.push_back(student);
}

json Classroom::asJSON(){
    json data;

    data["classID"] = classroomId;

    data["teacher"] = teacher.asJSON();

    for(auto i:studentList){
        data["students"].push_back(i->asJSON());
    }

    return data;
}

void Classroom::displayClassroom(){
    cout << "Classroom ID : " << classroomId << endl;
    cout << "Teacher  : " << teacher.getName() << endl;
    cout << "Students : " << endl;
    for(auto i:studentList){
        cout << "\tName : " << i->getName() << ", Student ID : " << i->getid() << ", Major : " << i->getStudentMajor() << endl;
        cout << "\t\tCitizenship : " << i->getCitizenshipScore() << ", Environmental = " << i->getEnvironmentalScore() << ", Religion = " << i->getReligionScore() << endl;

        if(i->getStudentMajor() == "art")
            cout << "\t\tArt : " << i->getMajorCourseScore() << endl;
        else if(i->getStudentMajor() == "literature")
            cout << "\t\tLiterature : " << i->getMajorCourseScore() << endl;
        else if(i->getStudentMajor() == "medical")
            cout << "\t\tMedical : " << i->getMajorCourseScore() << endl;
    }
}