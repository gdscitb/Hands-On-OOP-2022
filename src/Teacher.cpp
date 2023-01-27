#include "Teacher.h"

Teacher::Teacher(){};

Teacher::Teacher(string myName){
    id = time(0) + randint(-10, 10);
    name = myName;
}

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