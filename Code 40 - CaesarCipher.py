alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

alphabet_length = len(alphabet)
password = input("Type your password: ").lower()
shift = int(input("How many times do you want to shift it? "))
password_splited = list(password)
password_splited_length = len(password_splited)
ask = True
new_list = []
encrypted = False
decrypted = False

def encrypt(password_splited, shift):    
    aux = 0
    global new_list, encrypted, decrypted, password
    if decrypted == True:
        #new_list.clear()
        for i in range(0, len(new_list)):               
            pos = alphabet.index(new_list[i])

            if new_list[i] == alphabet[pos]:            
                pos+=shift
                aux = alphabet[pos]
                new_list.append(aux)
    else: 
        for i in range(0, password_splited_length):               
            position = alphabet.index(password_splited[i])
            
            if password_splited[i] == alphabet[position]:            
                position+=shift
                aux = alphabet[position]
                new_list.append(aux)
    encrypted=True            
    password = new_list
    decrypted = False
    print(f"The menssage was encrypted to {new_list}\n", end=" ")

def decrypt(password_splited, shift):
    global new_list, encrypted, decrypted, password
    if encrypted == True:
        #new_list.clear()   
        for i in range(0, len(new_list)):               
            pos = alphabet.index(new_list[i])

            if new_list[i] == alphabet[pos]:            
                pos-=shift
                aux = alphabet[pos]
                new_list.append(aux)
    else:   
        for i in range(0, password_splited_length):               
            position = alphabet.index(password_splited[i])

            if password_splited[i] == alphabet[position]:            
                position-=shift
                aux = alphabet[position]
                new_list.append(aux)
    decrypted = True
    password = new_list 
    encrypted = False           
    print(f"The menssage was encrypted to {new_list}\n", end=" ")



while ask == True:
    
    step = input("You want to encrypt or decrypt the menssage?").lower()    
        
    if step == 'encrypt':
        encrypt(password_splited=password_splited, shift=shift)
    elif step == 'decrypt':
        decrypt(password_splited=password_splited,shift=shift)
    else:
        print("Error: choose between encrypt or decrypt")
        question = input('\nDo you want to try again? ')
        if question == 'yes':
            pass
        else:
            ask = False
