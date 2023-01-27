#include "Student.h"

int randint(int start, int end){
    return rand() % (end - start + 1) + start;
}

ArtStudent::ArtStudent(int myid, string myName){
    id = myid;
    name = myName;
    studentMajor = art;

    citizenshipScore = randint(60, 90);
    religionScore = randint(60, 90);
    environmentalScore = randint(60, 90);
    artScore = randint(60, 90);
}

LiteratureStudent::LiteratureStudent(int myid, string myName){
    id = myid;
    name = myName;
    studentMajor = art;

    citizenshipScore = randint(60, 90);
    religionScore = randint(60, 90);
    environmentalScore = randint(60, 90);
    literatureScore = randint(60, 90);
}

MedicalStudent::MedicalStudent(int myid, string myName){
    id = myid;
    name = myName;
    studentMajor = art;

    citizenshipScore = randint(60, 90);
    religionScore = randint(60, 90);
    environmentalScore = randint(60, 90);
    medicalScore = randint(60, 90);
}

json Student::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;


    return data;
};

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