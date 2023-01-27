#include "Classroom.h"

Classroom::Classroom(int myclassid, Teacher myteacher){
    classroomId = myclassid;
    teacher = myteacher;
}

void Classroom::addStudent(Student student){
    studentList.push_back(student);
}

json Classroom::asJSON(){
    json data;

    data["teacher"] = teacher.asJSON();

    for(auto i:studentList){
        data["students"].push_back(i.asJSON());
    }
    


    return data;
}