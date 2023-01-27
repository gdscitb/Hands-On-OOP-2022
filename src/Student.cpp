#include "Student.h"

ArtStudent::ArtStudent(string myName, int citizenship, int religion, int environmental, int myart){
    id = time(0) + randint(-10, 10);
    name = myName;
    studentMajor = art;

    citizenshipScore = citizenship;
    religionScore = religion;
    environmentalScore = environmental;
    artScore = myart;
}

ArtStudent::ArtStudent(int myid, string myName, int citizenship, int religion, int environmental, int myart){
    id = myid;
    name = myName;
    studentMajor = art;

    citizenshipScore = citizenship;
    religionScore = religion;
    environmentalScore = environmental;
    artScore = myart;
}

LiteratureStudent::LiteratureStudent(string myName, int citizenship, int religion, int environmental, int myliterature){
    id = time(0) + randint(-10, 10);
    name = myName;
    studentMajor = literature;

    citizenshipScore = citizenship;
    religionScore = religion;
    environmentalScore = environmental;
    literatureScore = myliterature;
}

LiteratureStudent::LiteratureStudent(int myid, string myName, int citizenship, int religion, int environmental, int myliterature){
    id = myid;
    name = myName;
    studentMajor = literature;

    citizenshipScore = citizenship;
    religionScore = religion;
    environmentalScore = environmental;
    literatureScore = myliterature;
}

MedicalStudent::MedicalStudent(string myName, int citizenship, int religion, int environmental, int mymedical){
    id = time(0) + randint(-10, 10);
    name = myName;
    studentMajor = art;

    citizenshipScore = citizenship;
    religionScore = religion;
    environmentalScore = environmental;
    medicalScore = mymedical;
}

MedicalStudent::MedicalStudent(int myid, string myName, int citizenship, int religion, int environmental, int mymedical){
    id = myid;
    name = myName;
    studentMajor = art;

    citizenshipScore = citizenship;
    religionScore = religion;
    environmentalScore = environmental;
    medicalScore = mymedical;
}

string Student::getStudentMajor(){
    string mymajor[] = {"art", "literature", "medical"};

    return mymajor[studentMajor];
}

int Student::getCitizenshipScore(){
    return citizenshipScore;
}

int Student::getEnvironmentalScore(){
    return environmentalScore;
}

int Student::getReligionScore(){
    return religionScore;
}

int ArtStudent::getMajorCourseScore(){
    return artScore;
}

int LiteratureStudent::getMajorCourseScore(){
    return literatureScore;
}

int MedicalStudent::getMajorCourseScore(){
    return medicalScore;
}


// json Student::asJSON(){
//     // json data;

//     // data["identifier"]["id"] = id;
//     // data["identifier"]["name"] = name;

//     // data["scores"]["citizenship"] = citizenshipScore;
//     // data["scores"]["religion"] = religionScore;
//     // data["scores"]["environmental"] = environmentalScore;


//     // return data;
// };

json ArtStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;
    data["identifier"]["major"] = getStudentMajor(); // enum

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["majorCourse"] = artScore;

    return data;
}

json LiteratureStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;
    data["identifier"]["major"] = getStudentMajor(); // enum


    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["majorCourse"] = literatureScore;

    return data;
}

json MedicalStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;
    data["identifier"]["major"] = getStudentMajor(); // enum

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["majorCourse"] = medicalScore;

    return data;
}