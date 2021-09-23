//You are given a positive integer A. You have to print the sum of all odd numbers in the range [1, A].

def main():
    A= int(input())
    s = 0
    for i in range (A+1):
        if(i%2!=0):
            s+= i
    print(s)
    
    
    return 0

if __name__ == '__main__':
    main()