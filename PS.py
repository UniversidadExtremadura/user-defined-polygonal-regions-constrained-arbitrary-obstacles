"""
UNIVERSITY OF EXTREMADURA
MEDIA ENGINEERING GROUP
CONTACT: andresc@unex.es
"""

import numpy as np
from time import time
from fractions import Fraction

puntos = [[5,8],[6,7],[7,7],[8,8],[9,9],
[9,8],[9,7],[9,6],[8,5],[7,3],
[8,2],[9,1],[8,1],[7,1],[6,1],
[5,2],[4,1],[3,0],[2,1],[2,2],
[0,3],[1,4],[1,5],[2,6],[3,7],
[4,7],[5,7],[8,7],[3,6],[4,6],
[5,6],[6,6],[7,6],[8,6],[2,5],
[3,5],[4,5],[5,5],[6,5],[7,5],
[2,4],[3,4],[4,4],[5,4],[6,4],
[7,4],[1,3],[2,3],[3,3],[4,3],
[5,3],[6,3],[3,2],[4,2],[6,2],
[7,2],[3,1]];

poligono = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26];

ppoints = [35,36,40,41,53]

segments = [[27,34],[32,44,54],[30,38,45],[44,52,56],[43,47]];

def direccion(p, q, r):  
    dire = (q[0] - p[0]) * (r[1] - p[1]) - (r[0] - p[0]) * (q[1] - p[1])
    round(dire, 1)
    return dire

def alineadosp(p, q, r):  
    alinp = min(p[0], q[0]) <= r[0] <= max(p[0], q[0]) and min(p[1], q[1]) <= r[1] <= max(p[1], q[1])
    return alinp

def interseccion(l1, l2):  
    inter = False
    p1 = l1[0]
    p2 = l1[1]
    p3 = l2[0]
    p4 = l2[1]
    d1 = direccion(p3, p4, p1)
    d2 = direccion(p3, p4, p2)
    d3 = direccion(p1, p2, p3)
    d4 = direccion(p1, p2, p4)
    if p1 != p3 and p1 != p4 and p2 != p3 and p2 != p4:
        if ((d1 > 0 and d2 < 0) or (d1 < 0 and d2 > 0)) and ((d3 > 0 and d4 < 0) or (d3 < 0 and d4 > 0)):
            inter = True
        else:
            if d1 == 0 and alineadosp(p3, p4, p1):
                inter = True
            else:
                if d2 == 0 and alineadosp(p3, p4, p2):
                    inter = True
                else:
                    if d3 == 0 and alineadosp(p1, p2, p3):
                        inter = True
                    else:
                        if d4 == 0 and alineadosp(p1, p2, p4):
                            inter = True
    else:
        inter = False
    return inter

def alineadospol(punt, p, poly):
    alin = False
    lad = []
    for i in range(0, len(poly)):
        lad.append(poly[i])
    lad.append(poly[0])
    for i in range(0, len(lad) - 1):
        if direccion(punt[lad[i] - 1], punt[lad[i + 1] - 1], p) == 0:
            if alineadosp(punt[lad[i] - 1], punt[lad[i + 1] - 1], p):
                alin = True
                break
    return alin

def angulo(u, v):  
    if not isinstance(u[0], int) and not isinstance(u[0], float):
        num = u[0].numerator
        dem = u[0].denominator
        u[0] = num / dem
    if not isinstance(u[1], int) and not isinstance(u[1], float):
        num = u[1].numerator
        dem = u[1].denominator
        u[1] = num / dem
    if not isinstance(v[0], int) and not isinstance(v[0], float):
        num = v[0].numerator
        dem = v[0].denominator
        v[0] = num / dem
    if not isinstance(v[1], int) and not isinstance(v[1], float):
        num = v[1].numerator
        dem = v[1].denominator
        v[1] = num / dem
    angulo = 0
    if u[0] * u[0] + u[1] * u[1] != 0:
        if v[0] * v[0] + v[1] * v[1] != 0:
            det = u[0] * v[1] - u[1] * v[0]
            v1_u = u / np.linalg.norm(u)  # calculos para el angulo
            v2_u = v / np.linalg.norm(v)
            if det > 0:
                angulo = np.arccos(np.clip(np.dot(v1_u, v2_u), -1.0, 1.0))  # angulo
            else:
                angulo = -np.arccos(np.clip(np.dot(v1_u, v2_u), -1.0, 1.0))  # -angulo
    return angulo

def pointin(punt, p, poly):  
    if alineadospol(punt, p, poly):
        point = True
    else:
        point = False
        n = len(poly)
        suma = 0
        for i in range(0, n - 1):
            suma = suma + angulo([puntos[poly[i] - 1][0] - p[0], puntos[poly[i] - 1][1] - p[1]],
                                 [puntos[poly[i + 1] - 1][0] - p[0], puntos[poly[i + 1] - 1][1] - p[1]])
        suma = suma + angulo([puntos[poly[n - 1] - 1][0] - p[0], puntos[poly[n - 1] - 1][1] - p[1]],
                             [puntos[poly[0] - 1][0] - p[0], puntos[poly[0] - 1][1] - p[1]])

        if np.abs(suma) >= np.pi:
            point = True
    return point

def ladospol(punt, poly):  
    n = len(poly)
    lad = []
    for i in range(0, n - 1):
        lad.append([punt[poly[i] - 1], punt[poly[i + 1] - 1]])
    lad.append([punt[poly[n - 1] - 1], punt[poly[0] - 1]])
    return lad

def medio(p, q):  
    c1 = (p[0] + q[0]) / 2
    c2 = (p[1] + q[1]) / 2
    m = [c1, c2]
    return m

def interseccionp(l1, l2):  
    u1 = [l1[1][0] - l1[0][0], l1[1][1] - l1[0][1]]
    u2 = [l2[1][0] - l2[0][0], l2[1][1] - l2[0][1]]
    coinc = False
    if u1[0] * u2[1] == u1[1] * u2[0]:
        coinc = True
    if not coinc:
        if interseccion(l1, l2):
            a = l1[1][1] - l1[0][1]
            b = l1[0][0] - l1[1][0]
            c = l1[0][0] * l1[1][1] - l1[1][0] * l1[0][1]

            d = l2[1][1] - l2[0][1]
            e = l2[0][0] - l2[1][0]
            f = l2[0][0] * l2[1][1] - l2[1][0] * l2[0][1]
            if l1[0][0] == l1[1][0]:
                p = [c / a, (a * f - c * d) / (a * e)]
            else:
                if l1[0][1] == l1[1][1]:
                    p = [Fraction((b * f - c * e), (b * d)), Fraction(c, b)]
                else:
                    p = [Fraction((b * f - c * e), (b * d - a * e)), Fraction((a * f - c * d), (a * e - b * d))]
    else:
        p = l2[0]
    return p

def interseccionpoly(l, lado, poly):
    int2 = False
    eps = Fraction(1, 100000)
    if interseccion(l, lado):
        p = interseccionp(l, lado)
        if l[0][0] == l[1][0]:
            m1 = [l[0][0], p[1] - eps]
            m2 = [l[0][0], p[1] + eps]
        else:
            if l[0][1] == l[1][1]:
                m1 = [p[0] - eps, l[0][1]]
                m2 = [p[0] + eps, l[0][1]]
            else:
                a = l[1][1] - l[0][1]
                b = l[0][0] - l[1][0]
                c = l[0][0] * l[1][1] - l[1][0] * l[0][1]

                m1 = [p[0] - eps, ((c - a * (p[0] - eps)) / b)]
                m2 = [p[0] + eps, ((c - a * (p[0] + eps)) / b)]

        if pointin(puntos, m1, poly) == False or pointin(puntos, m2, poly) == False:
            int2 = True
    return int2

def interseccionpol(l):
    lados = ladospol(puntos, poligono)
    int2 = False
    for i in range(0, len(lados)):
        int2 = interseccionpoly(l, lados[i], poligono)
        if int2:
            break

    if not int2:
        if segments:
            for i in range(0, len(segments)):
                if int2:
                    break
                n = len(segments[i])
                s = [puntos[segments[i][0] - 1], puntos[segments[i][n - 1] - 1]]
                if interseccion(l, s):
                    p = interseccionp(l, s)
                    if (direccion(puntos[segments[i][0] - 1], l[0], p) != 0
                            and direccion(puntos[segments[i][0] - 1], l[1], p) != 0
                            and direccion(puntos[segments[i][n - 1] - 1], l[0], p) != 0
                            and direccion(puntos[segments[i][n - 1] - 1], l[1], p) != 0):
                        int2 = True
    return int2

def matriz(punt):  
    matriz = []
    for i in range(0, len(punt)):
        matriz.append([])
        for j in range(0, len(punt)):
            matriz[i].append(0)

    lados = ladospol(punt, poligono)
    for i in range(0, len(punt) - 1):
        for j in range(i + 1, len(punt)):
            l = [punt[i], punt[j]]
            aux2 = lados + [val for val in [l] if val not in lados]
            if len(aux2) == len(lados):
                matriz[i][j] = 1
            else:
                if not interseccionpol(l):
                    m = medio(punt[i], punt[j])
                    if pointin(punt, m, poligono):
                        matriz[i][j] = 1
    for i in range(0, len(punt)):
        for j in range(0, len(punt)):
            matriz[j][i] = matriz[i][j]
    return matriz

def alineadosc(punt, camino):
    cam = camino.copy()
    cam.append(camino[0])
    cam.append(camino[1])
    for i in range(0, len(camino)):
        alig = punt[cam[i] - 1][0] * (punt[cam[i + 1] - 1][1] - punt[cam[i + 2] - 1][1]) + punt[cam[i + 1] - 1][0] * (
                    punt[cam[i + 2] - 1][1] - punt[cam[i] - 1][1]) + punt[cam[i + 2] - 1][0] * (
                           punt[cam[i] - 1][1] - punt[cam[i + 1] - 1][1])
        if alig == 0:
            break
    return alig

def segmentos(punt, camino):
    n = len(camino)
    lad = []
    for i in range(0, len(camino) - 1):
        lad.append([punt[camino[i] - 1], punt[camino[i + 1] - 1]])
    lad.append([punt[camino[n - 1] - 1], punt[camino[0] - 1]])
    seg = False
    m = len(lad)
    for i in range(0, m - 1):
        if seg:
            break
        for j in range(i, m):
            seg = interseccion(lad[i], lad[j])
            if seg:
                break
    return seg

def SidesPoints(punt, polig, ppoints):
    int2 = False
    for i in range(0, len(ppoints)):
        int2 = (pointin(punt, punt[ppoints[i] - 1], polig) == True and alineadospol(punt, punt[ppoints[i] - 1],
                                                                                    polig) == False)
        if int2:
            break
    return int2

def SidesSegments(punt, polig, segments):
    seg = False
    for i in range(0, len(segments)):
        if seg:
            break
        n = len(segments[i])
        for j in range(0, n - 1):
            m = medio(punt[segments[i][j] - 1], punt[segments[i][j + 1] - 1])
            if pointin(punt, m, polig):
                if not alineadospol(punt, m, polig):
                    seg = True
                    break
        m = medio(punt[segments[i][n - 1] - 1], punt[segments[i][0] - 1])
        if pointin(punt, m, polig):
            if not alineadospol(punt, m, polig):
                seg = True
    return seg

def polygons(nodo1, nodo2, distancia, matriz):
    aristas = []
    poligono = []
    polig = []
    aristas.append([nodo1])
    if matriz[nodo1 - 1][nodo2 - 1] == 1:
        for i in range(0, distancia):
            temp = []
            for k in range(0, len(aristas)):
                ultimo = aristas[k][i]
                if ultimo != nodo2:
                    for j in range(0, len(matriz)):
                        if matriz[ultimo - 1][j - 1] == 1:
                            if j not in aristas[k]:
                                aristas[k].append(j)
                                temp.extend([aristas[k].copy()])
                                aristas[k].pop()
            aristas = temp.copy()

        temp = []
        for k in range(0, len(aristas)):
            if aristas[k][distancia] == nodo2:
                if not segmentos(puntos, aristas[k]):
                    if alineadosc(puntos, aristas[k]) != 0:
                        temp.append(aristas[k])

        for i in range(0, len(temp)):
            if not SidesPoints(puntos, temp[i], ppoints):
                if not SidesSegments(puntos, temp[i], segments):
                    poligono.append(temp[i])

    return poligono

def duplicados(poligonos):  
    aux = set()
    final = []
    for i in range(0, len(poligonos)):
        if frozenset(poligonos[i]) not in aux:
            final.append(poligonos[i])
            aux.add(frozenset(poligonos[i]))
    return final

def update(poligonos, fun):  
    upd = []
    maxi = 0
    for i in range(0, len(poligonos)):
        f = funcion(poligonos[i], fun)
        if f >= maxi:
            upd.append(poligonos[i].copy())
        if f > maxi:
            maxi = f
            upd = [poligonos[i].copy()]
    return upd

def funcion(poligono, fun):  
    n = len(poligono)
    funcion = 0
    if fun == 0:  # funcion area
        for i in range(1, n):
            funcion = funcion + round(np.linalg.det(np.array([puntos[poligono[i - 1] - 1], puntos[poligono[i] - 1]])))
        funcion = funcion + round(np.linalg.det(np.array([puntos[poligono[n - 1] - 1], puntos[poligono[0] - 1]])))
        funcion = np.abs(0.5 * funcion)
    if fun == 1:  # funcion perimetro
        for i in range(1, n):
            funcion = funcion + np.sqrt(((puntos[poligono[i - 1] - 1][1] - puntos[poligono[i] - 1][1]) ** 2) + (
                        (puntos[poligono[i - 1] - 1][0] - puntos[poligono[i] - 1][0]) ** 2))
        funcion = round(funcion + np.sqrt(((puntos[poligono[n - 1] - 1][1] - puntos[poligono[0] - 1][1]) ** 2) + (
                    (puntos[poligono[n - 1] - 1][0] - puntos[poligono[0] - 1][0]) ** 2)), 12)
    return funcion

def solution(nodos, distancia, matriz, fun):
    pol = []
    for i in range(0, nodos - 1):
        for j in range(i + 2, nodos + 1):
            aux = polygons(i + 1, j, distancia, matriz).copy()
            pol = [*map(list, list(set(map(tuple, pol)) | set(map(tuple, aux))))].copy()
    poligonos = duplicados(update(pol, fun))
    poligonos.sort()
    return poligonos


matriz = matriz(puntos)
print(matriz)

nodos = 57

print("----------- TRIANGULO---------------")
inicio = time()
print(solution(nodos, 2, matriz, 0))
fin = time() - inicio
print("Tiempo:", fin)

print("----------- CUADRILÁTERO ---------------")
inicio = time()
print(solution(nodos, 3, matriz, 0))
fin = time() - inicio
print("Tiempo:", fin)

print("----------- PENTAGONO ---------------")
inicio = time()
print(solution(nodos, 4, matriz, 0))
fin = time() - inicio
print("Tiempo:", fin)

print("----------- HEXAGONO ---------------")
inicio = time()
print(solution(nodos, 5, matriz, 0))
fin = time() - inicio
print("Tiempo:", fin)

print("----------- HEPTAGONO ---------------")
inicio = time()
print(solution(nodos, 6, matriz, 0))
fin = time() - inicio
print("Tiempo:", fin)


