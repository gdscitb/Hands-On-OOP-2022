#ifndef RANDINT_H
#define RANDINT_H

#include <random>
    
    inline int randint(int start, int end){
        return rand() % (end - start + 1) + start;
    }

#endif // !RANDINT_H