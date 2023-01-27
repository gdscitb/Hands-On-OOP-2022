#include "Teacher.h"

Teacher::Teacher(){};

Teacher::Teacher(int myid, string myName){
    id = myid;
    name = myName;
}

json Teacher::asJSON(){
    json data;
    
    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    return data;
}