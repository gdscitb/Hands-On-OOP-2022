#include <iostream>
#include <string>
#include <bits/stdc++.h>
void checkInput(std::string * ptr);
bool checkType(std::string typing);

class Pokemon{

    public:
        virtual std::string getName(std::string pokemon) const = 0;
        
};

class Pokemon_A: public Pokemon{
    public:

        std::string getName(std::string pokemon) const {
            return pokemon;
        }


};



class Type{

    public:
        virtual std::string getType(std::string type) const = 0;
        virtual std::string check_type_relation(std::string typing) const = 0;

        
};


class Type_A: public Type{

    public:
        std::string getType(std::string type) const {
            return type;
        }

        std::string check_type_relation(std::string typing) const {
            if(typing == "fire"){
                return "is strong against grass, bug, steel, and ice types. But weak against water, ground and rock types";
            }
            else if(typing == "water"){
                return "is strong against fire, rock, and ground types. But weak against grass, and electric types";
            }
            else if(typing == "grass"){
                return "is strong against water, rock, and ground types. But weak against fire, flying, bug, poison, and ice types";
            }
            else if(typing == "rock"){
                return "is strong against flying, fire, ice and bug types. But weak against water, grass, fighting, ground and steel types";
            }
            else if(typing == "steel"){
                return "is strong against rock, ice, and fairy types. But weak against fire, fighting, and ground types";
            }
            else if(typing == "electric"){
                return "is strong against water and flying types. But weak against ground type";
            }
            else if(typing == "fairy"){
                return "is strong against fighting, dragon, and dark types. But weak against steel and poison types";
            }
            else if(typing == "dark"){
                return "is strong against psychic and ghost types. But weak against fighting, bug and fairy types";
            }
            else if(typing == "psychic"){
                return "is strong against fighting and poison types. But weak against dark, bug, and ghost types";
            }
            else if(typing == "poison"){
                return "is strong against fairy and grass types. But weak against psychic and ground types";
            }
            else if(typing == "fighting"){
                return "is strong against normal, ice, rock, dark, and steel types. But weak against flying, psychic, and fairy types";
            }
            else if(typing == "flying"){
                return "is strong against grass, fighting and bug types. But weak against ice, electric, and rock types";
            }
            else if(typing == "normal"){
                return "does not have type that it is effective against and weak against fighting type";
            }
            else if(typing == "bug"){
                return "is strong against psychic, dark and grass types. But weak against fire, flying, and rock types";
            }
            else if(typing == "ground"){
                return "is strong against electric, rock, poison, fire, and steel types. But weak against water, grass, and ice types";
            }
            else if(typing == "ice"){
                return "is strong against types. But weak against fire, fighting, rock and steel types";
            }
            else if(typing == "ghost"){
                return "is strong against psychic and ghost types. But weak against dark and ghost types";
            }
            else{
                return "is strong against dragon type. But weak against dragon, ice, and fairy types";
            }
            
        }
        /*
        std::string UsefulFunc(const Pokemon &collaborator) const {
            const std::string result = collaborator.getName();
            return "i A worked with" + result;
        }
        */
        
};



class AbstractFact{

    public:
        virtual Pokemon *CreatePokemon() const = 0;
        virtual Type *SetType() const = 0;
};

class PokeFact : public AbstractFact{

    public:
        Pokemon *CreatePokemon() const {
            return new Pokemon_A();
        }

        Type *SetType() const {
            return new Type_A();
        }


};


void ClientCode(const AbstractFact &fact, std::string pokemon, std::string typing){
    const Pokemon *pokeobj = fact.CreatePokemon();
    const Type *typeobj = fact.SetType();
    std::string pokemon_name = pokeobj->getName(pokemon);  
    std::string pokemon_type = typeobj->getType(typing);
    std::string type_relation = typeobj->check_type_relation(typing);
    //std::string choice;

    //checkInput(&choice);
    //transform(choice.begin(), choice.end(), choice.begin(), ::tolower);

    std::cout << "Your " << pokemon_name << " " << type_relation;
    
    delete pokeobj;
    delete typeobj;
    
}



int main(){
    std::string pokemon1,typing1;
    

    std::cout << "Welcome... Enter your pokemon and its typing to get started" << std::endl;
    std::cout << "" << std::endl;

    std::cout << "Your Pokemon Name..." << std::endl;
    checkInput(&pokemon1);
    transform(pokemon1.begin(), pokemon1.end(), pokemon1.begin(), ::tolower);


    std::cout << "Pokemon Type..." << std::endl;
    bool cond = true;
    while(cond){
        checkInput(&typing1);
        transform(typing1.begin(), typing1.end(), typing1.begin(), ::tolower);

        cond = checkType(typing1);
        if(cond == true){
            std::cout << "Typing not found, please try again.." << std::endl;
            std::cout << "" << std::endl;
        }else{
            std::cout << "" << std::endl;
        }
        
    }
    

   
    std::cout << "" << std::endl;
    std::cout << "" << std::endl;

    

    PokeFact *Pf = new PokeFact();
    ClientCode(*Pf,pokemon1,typing1);

    delete Pf;

    

    

}

void checkInput(std::string * ptr){

    bool failure;
    do{

        failure = false;

        std::cout << "-> ";
        std::cin >> *ptr;

        if(std::cin.fail()){
            std::cin.clear();
            std::cin.ignore(256,'\n');
            failure = true;
            std::cout << "Invaid input!! Please try again.." << std::endl;
        }
    }while(failure);

}

bool checkType(std::string typing){
    if(typing == "fire"){
        return false;
    }
    else if(typing == "water"){
        return false;
    }
    else if(typing == "grass"){
        return false;
    }
    else if(typing == "rock"){
        return false;
    }
    else if(typing == "steel"){
        return false;
    }
    else if(typing == "electric"){
        return false;
    }
    else if(typing == "fairy"){
        return false;
    }
    else if(typing == "dark"){
        return false;
    }
    else if(typing == "psychic"){
        return false;
    }
    else if(typing == "poison"){
        return false;
    }
    else if(typing == "fighting"){
        return false;
    }
    else if(typing == "flying"){
        return false;
    }
    else if(typing == "normal"){
        return false;
    }
    else if(typing == "bug"){
        return false;
    }
    else if(typing == "ground"){
        return false;
    }
    else if(typing == "ice"){
        return false;
    }
    else if(typing == "ghost"){
        return false;
    }
    else if(typing == "dragon"){
        return false;
    }else{
        return true;
    }
            
}   
