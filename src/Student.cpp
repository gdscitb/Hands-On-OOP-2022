#include "Student.h"



Student::Student(int myid, string myName, Major myMajor){
    id = myid;
    name = myName;
    studentMajor = myMajor;

    cout << id << name << studentMajor << endl;
}

json ArtStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["art"] = artScore;

    return data;
}

json LiteratureStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["literature"] = literatureScore;

    return data;
}

json MedicalStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["medical"] = medicalScore;

    return data;
}