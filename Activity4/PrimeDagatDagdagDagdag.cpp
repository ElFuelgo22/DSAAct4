#include <iostream>

class Primes 
{
public:
    void prime_W(int W) 
    {
        int x, y, flg;
        std::cout << std::endl;

        for (x = 1; x <= W; x++) 
        {
            if (x == 1 || x == 0) 
            {
                continue;
            }

            flg = 1;
            for (y = 2; y <= x / 2; ++y) 
            {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }

            if (flg == 1) 
            {
                std::cout << x << " ";
            }
        }
    }
};

int main() {
    int W = 100;
    Primes obj;
    obj.prime_W(W);
    return 0;
}
