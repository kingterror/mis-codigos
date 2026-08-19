def cabecera():
    """Muestra la cabecera de la aplicación"""
    titulo = r"""
    _____                         _____               
    |  __ \                       |_   _|              
    | |  \/ __ _ _ __ ___   ___ _ __| | __ _  __ _ ___ 
    | | __ / _` | '_ ` _ \ / _ \ '__| |/ _` |/ _` / __|
    | |_\ \ (_| | | | | | |  __/ |  | | (_| | (_| \__ \
    \____/\__,_|_| |_| |_|\___|_|  \_/\__,_|\__, |___/
                                             __/ |    
                                             |___/     
               🎮 A POR TODAS 🎮
    """
    print(titulo)

def crear_tag_basico(nombre):
    """
    Genera un tag basico a partir del nombre

    Parametros:
    nombre(str): nombre del usuario

    Retorno
    str: String de los primeros 4 caracteres del nombre
    """
    tag=nombre[:4]
    return tag

def crear_tag_invertido(nombre):
    """
    Crea un tag invertido utilizando el nombre

    Parametros:
    nombre(str): nombre del usuario
    
    Retorno
    str: String de los primeros 4 caracteres del nombre
    """
    tag=nombre[::-1]
    return(tag)


def crear_tag_intercalado(nombre,apellido):
    """
    Funcion que genera un tag intercalando la primera Letra del nombre y apellido y luego continua con el resto
    
    Parametros:
    nombre(str): nombre del usuario
    apellido(str): apellido del usuario

    Retorno:
    None(imprime directamente)
    """
    print("4.Tag Intercalado: ",nombre[0],apellido[0],nombre[1:],apellido[1:],sep="")

def crear_tag_elite(nombre):
    """
    Funcion que genera un tag cogiendo las primeras 2 letras y las 2 ultimas del nombre

    Parametros
    nombre(str): nombre del usuario

    Retorno:
    None(imprime directamente)
    """
    print("5.Tag Elite: ",nombre[0:2],nombre[-2:],sep="")

def crear_tag_con_numero(nombre,num_fav):
    """
    Funcion que genera un tag cogiendo los primeros 5 letras de tu nombre + tu numero favorito
    
    Parametros
    nombre(str): nombre del usuario
    numero(int): numero favorito
    
    Retorno:
    None(imprime directamente)
    """
    print("3.Tag con Numero Favorito: ",nombre[0:5],num_fav,sep="")

def mostrar_estadisticas(nombre):
    """
    Funcion que muestra por pantalla las estadisticas del nombre introducido

    Parametros:
    nombre(str): nombre al cual le calcuremos estadisticas

    Retorno:
    None: muestra por pantalla la informacion
    """

    print("\n📊 ESTADISTICAS DE TU NOMBRE:")
    print(f"Nombre Completo: ",nombre)
    print("Longitud del Nombre: ",len(nombre))
    print("Primera letra: ",nombre[0])
    print("Ultima letra: ",nombre[-1])

def generar_todas_opciones(nombre,apellido,num_fav):
    """
    Funcion que genera todas las opciones de Gametags

    Parametros:
    nombre(str) -- nombre del usuario
    apellido(str) -- apellido del usuario
    num_fav(int) -- numero favorito del usuario

    Retorno
    None(imprime directamente)
    """
    print("\n=============================")
    print("🎯=Tus opciones de GameTags=")
    print("=============================")

    print("\n1.Tag Basico:",crear_tag_basico(nombre))
    print("2.Tag Invertido:",crear_tag_invertido(nombre))
    crear_tag_con_numero(nombre,num_fav)
    crear_tag_intercalado(nombre,apellido)
    crear_tag_elite(nombre)
    print("\n=============================")


#====================================
#APLICACION PRINCIPAL
#====================================

#Mostrar Cabecera
cabecera()

#Solicitar datos
nombre=input("\n👤 Introduce tu Nombre: ")
apellido=input("\n Introduce tu Apellido: ")
num_fav=input("\n🎲 Numero Favorito: ")

#Mostrar Estadisticas
mostrar_estadisticas(nombre)

#Mostrar Todos los Tags
generar_todas_opciones(nombre,apellido,num_fav)








