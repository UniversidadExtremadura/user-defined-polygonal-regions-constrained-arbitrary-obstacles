// UNIVERSITY OF EXTREMADURA
// MEDIA ENGINEERING GROUP
// CONTACT: andresc@unex.es

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class PS {
	static ArrayList<Integer> punto1 = new ArrayList<Integer>(Arrays.asList(5,8));
	static ArrayList<Integer> punto2 = new ArrayList<Integer>(Arrays.asList(6,7));
	static ArrayList<Integer> punto3 = new ArrayList<Integer>(Arrays.asList(7,7));
	static ArrayList<Integer> punto4 = new ArrayList<Integer>(Arrays.asList(8,8));
	static ArrayList<Integer> punto5 = new ArrayList<Integer>(Arrays.asList(9,9));
	static ArrayList<Integer> punto6 = new ArrayList<Integer>(Arrays.asList(9,8));
	static ArrayList<Integer> punto7 = new ArrayList<Integer>(Arrays.asList(9,7));
	static ArrayList<Integer> punto8 = new ArrayList<Integer>(Arrays.asList(9,6));
	static ArrayList<Integer> punto9 = new ArrayList<Integer>(Arrays.asList(8,5));
	static ArrayList<Integer> punto10 = new ArrayList<Integer>(Arrays.asList(7,3));
	static ArrayList<Integer> punto11 = new ArrayList<Integer>(Arrays.asList(8,2));
	static ArrayList<Integer> punto12 = new ArrayList<Integer>(Arrays.asList(9,1));
	static ArrayList<Integer> punto13 = new ArrayList<Integer>(Arrays.asList(8,1));
	static ArrayList<Integer> punto14 = new ArrayList<Integer>(Arrays.asList(7,1));
	static ArrayList<Integer> punto15 = new ArrayList<Integer>(Arrays.asList(6,1));
	static ArrayList<Integer> punto16 = new ArrayList<Integer>(Arrays.asList(5,2));
	static ArrayList<Integer> punto17 = new ArrayList<Integer>(Arrays.asList(4,1));
	static ArrayList<Integer> punto18 = new ArrayList<Integer>(Arrays.asList(3,0));
	static ArrayList<Integer> punto19 = new ArrayList<Integer>(Arrays.asList(2,1));
	static ArrayList<Integer> punto20 = new ArrayList<Integer>(Arrays.asList(2,2));
	static ArrayList<Integer> punto21 = new ArrayList<Integer>(Arrays.asList(0,3));
	static ArrayList<Integer> punto22 = new ArrayList<Integer>(Arrays.asList(1,4));
	static ArrayList<Integer> punto23 = new ArrayList<Integer>(Arrays.asList(1,5));
	static ArrayList<Integer> punto24 = new ArrayList<Integer>(Arrays.asList(2,6));
	static ArrayList<Integer> punto25 = new ArrayList<Integer>(Arrays.asList(3,7));
	static ArrayList<Integer> punto26 = new ArrayList<Integer>(Arrays.asList(4,7));
	static ArrayList<Integer> punto27 = new ArrayList<Integer>(Arrays.asList(5,7));
	static ArrayList<Integer> punto28 = new ArrayList<Integer>(Arrays.asList(8,7));
	static ArrayList<Integer> punto29 = new ArrayList<Integer>(Arrays.asList(3,6));
	static ArrayList<Integer> punto30 = new ArrayList<Integer>(Arrays.asList(4,6));
	static ArrayList<Integer> punto31 = new ArrayList<Integer>(Arrays.asList(5,6));
	static ArrayList<Integer> punto32 = new ArrayList<Integer>(Arrays.asList(6,6));
	static ArrayList<Integer> punto33 = new ArrayList<Integer>(Arrays.asList(7,6));
	static ArrayList<Integer> punto34 = new ArrayList<Integer>(Arrays.asList(8,6));
	static ArrayList<Integer> punto35 = new ArrayList<Integer>(Arrays.asList(2,5));
	static ArrayList<Integer> punto36 = new ArrayList<Integer>(Arrays.asList(3,5));
	static ArrayList<Integer> punto37 = new ArrayList<Integer>(Arrays.asList(4,5));
	static ArrayList<Integer> punto38 = new ArrayList<Integer>(Arrays.asList(5,5));
	static ArrayList<Integer> punto39 = new ArrayList<Integer>(Arrays.asList(6,5));
	static ArrayList<Integer> punto40 = new ArrayList<Integer>(Arrays.asList(7,5));
	static ArrayList<Integer> punto41 = new ArrayList<Integer>(Arrays.asList(2,4));
	static ArrayList<Integer> punto42 = new ArrayList<Integer>(Arrays.asList(3,4));
	static ArrayList<Integer> punto43 = new ArrayList<Integer>(Arrays.asList(4,4));
	static ArrayList<Integer> punto44 = new ArrayList<Integer>(Arrays.asList(5,4));
	static ArrayList<Integer> punto45 = new ArrayList<Integer>(Arrays.asList(6,4));
	static ArrayList<Integer> punto46 = new ArrayList<Integer>(Arrays.asList(7,4));
	static ArrayList<Integer> punto47 = new ArrayList<Integer>(Arrays.asList(1,3));
	static ArrayList<Integer> punto48 = new ArrayList<Integer>(Arrays.asList(2,3));
	static ArrayList<Integer> punto49 = new ArrayList<Integer>(Arrays.asList(3,3));
	static ArrayList<Integer> punto50 = new ArrayList<Integer>(Arrays.asList(4,3));
	static ArrayList<Integer> punto51 = new ArrayList<Integer>(Arrays.asList(5,3));
	static ArrayList<Integer> punto52 = new ArrayList<Integer>(Arrays.asList(6,3));
	static ArrayList<Integer> punto53 = new ArrayList<Integer>(Arrays.asList(3,2));
	static ArrayList<Integer> punto54 = new ArrayList<Integer>(Arrays.asList(4,2));
	static ArrayList<Integer> punto55 = new ArrayList<Integer>(Arrays.asList(6,2));
	static ArrayList<Integer> punto56 = new ArrayList<Integer>(Arrays.asList(7,2));
	static ArrayList<Integer> punto57 = new ArrayList<Integer>(Arrays.asList(3,1));


	static ArrayList<ArrayList<Integer>> puntos = new ArrayList<ArrayList<Integer>>() {
		{
			add(punto1);
			add(punto2);
			add(punto3);
			add(punto4);
			add(punto5);
			add(punto6);
			add(punto7);
			add(punto8);
			add(punto9);
			add(punto10);
			add(punto11);
			add(punto12);
			add(punto13);
			add(punto14);
			add(punto15);
			add(punto16);
			add(punto17);
			add(punto18);
			add(punto19);
			add(punto20);
			add(punto21);
			add(punto22);
			add(punto23);
			add(punto24);
			add(punto25);
			add(punto26);
			add(punto27);
			add(punto28);
			add(punto29);
			add(punto30);
			add(punto31);
			add(punto32);
			add(punto33);
			add(punto34);
			add(punto35);
			add(punto36);
			add(punto37);
			add(punto38);
			add(punto39);
			add(punto40);
			add(punto41);
			add(punto42);
			add(punto43);
			add(punto44);
			add(punto45);
			add(punto46);
			add(punto47);
			add(punto48);
			add(punto49);
			add(punto50);
			add(punto51);
			add(punto52);
			add(punto53);
			add(punto54);
			add(punto55);
			add(punto56);
			add(punto57);
		}
	};

	static ArrayList<Integer> poligono = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));

	static ArrayList<Integer> ppoints = new ArrayList<Integer>(Arrays.asList(35,36,40,41,53));

	static ArrayList<Integer> segment1 = new ArrayList<Integer>(Arrays.asList(27,34));
	static ArrayList<Integer> segment2 = new ArrayList<Integer>(Arrays.asList(30,38,45));
	static ArrayList<Integer> segment3 = new ArrayList<Integer>(Arrays.asList(32,44,54));
	static ArrayList<Integer> segment4 = new ArrayList<Integer>(Arrays.asList(44,52,56));
	static ArrayList<Integer> segment5 = new ArrayList<Integer>(Arrays.asList(43,47));
	static ArrayList<ArrayList<Integer>> segments = new ArrayList<ArrayList<Integer>>() {
		{
			add(segment1);
			add(segment2);
			add(segment3);
			add(segment4);
			add(segment5);
		}
	};

	public static void main(String[] args) {
		long inicio;
		long fin;
		double tiempo;

		int nodos = 57;

        inicio = System.currentTimeMillis();
        ArrayList<ArrayList<Integer>> matriz;
        matriz = matriz(puntos);
        System.out.println(matriz);
        fin = System.currentTimeMillis();
        tiempo = (double) ((fin - inicio));
        System.out.println("Matriz = " + tiempo);
        System.out.println("---------------------");

        inicio = System.currentTimeMillis();
        System.out.println("TRIANGLE = " + poligonos(nodos, 2, matriz, 0));
        fin = System.currentTimeMillis();
        tiempo = (double) ((fin - inicio));
        System.out.println("Tiempo = " + tiempo/1000 + "seg");
        System.out.println("---------------------");

        inicio = System.currentTimeMillis();
        System.out.println("QUADRILATERAL = " + poligonos(nodos, 3, matriz, 0));
        fin = System.currentTimeMillis();
        tiempo = (double) ((fin - inicio));
        System.out.println("Tiempo = " + tiempo/1000 + "seg");
        System.out.println("---------------------");

        inicio = System.currentTimeMillis();
        System.out.println("PENTAGON = " + poligonos(nodos, 4, matriz, 0));
        fin = System.currentTimeMillis();
        tiempo = (double) ((fin - inicio));
        System.out.println("Tiempo = " + tiempo/1000 + "seg");
        System.out.println("---------------------");
		
    }

	static int direccion(ArrayList<Integer> p, ArrayList<Integer> q, ArrayList<Integer> r) {
		int dire;
		dire = (q.get(0) - p.get(0)) * (r.get(1) - p.get(1)) - (r.get(0) - p.get(0)) * (q.get(1) - p.get(1));
		return dire;
	}

	static boolean alineadosp(ArrayList<Integer> p, ArrayList<Integer> q, ArrayList<Integer> r) {
		boolean alinp;
		alinp = Math.min(p.get(0), q.get(0)) <= r.get(0) && r.get(0) <= Math.max(p.get(0), q.get(0))
				&& Math.min(p.get(1), q.get(1)) <= r.get(1) && r.get(1) <= Math.max(p.get(1), q.get(1));
		return alinp;
	}

    static double GetAngleABCbig( ArrayList<BigDecimal> uno,ArrayList<BigDecimal>tres , ArrayList<Integer> dos){
        float uno0,uno1,tres0,tres1;
        uno0 = uno.get(0).floatValue();
        uno1 = uno.get(1).floatValue();
        tres0 = tres.get(0).floatValue();
        tres1 = tres.get(1).floatValue();
        float ab0,ab1,cb0,cb1;
        ab0 = dos.get(0) - uno0;
        ab1 = dos.get(1) - uno1;
        cb0 = dos.get(0) - tres0;
        cb1 = dos.get(1) - tres1;
        double dot = (ab0 * cb0 + ab1 * cb1);
        double cross = (ab0 *cb1 - ab1 * cb0);
        return Math.atan2(cross, dot);
    }

    static double anguloBig(ArrayList<BigDecimal> u,ArrayList<BigDecimal> v) {
        ArrayList<Integer> p3 = new ArrayList<>(Arrays.asList(0, 0));
        double angulo = 0;
        float u0,u1,v0,v1;
        u0 = u.get(0).floatValue();
        u1 = u.get(1).floatValue();
        v0 = v.get(0).floatValue();
        v1 = v.get(1).floatValue();
        if(u0*u0+u1*u1 != 0 && v0*v0+v1*v1 != 0) {
            angulo = GetAngleABCbig(u, v, p3);
        }
        return angulo;
    }

    static float direccionBig(ArrayList<Integer> p, ArrayList<Integer> q, ArrayList<BigDecimal> r) {
        float dire;
        float r0 = r.get(0).floatValue();
        float r1 = r.get(1).floatValue();
        dire = (q.get(0) - p.get(0)) * (r1 - p.get(1)) - (r0 - p.get(0)) * (q.get(1) - p.get(1));
        return dire;
    }

    static boolean alineadospBig(ArrayList<Integer> p, ArrayList<Integer> q, ArrayList<BigDecimal> r) {
        boolean alinp;
        alinp = Math.min(p.get(0), q.get(0)) <= r.get(0).floatValue() && r.get(0).floatValue() <= Math.max(p.get(0), q.get(0))
                && Math.min(p.get(1), q.get(1)) <= r.get(1).floatValue() && r.get(1).floatValue() <= Math.max(p.get(1), q.get(1));
        return alinp;
    }

    static boolean alineadospolBig(ArrayList<ArrayList<Integer>> punt,ArrayList<BigDecimal> p, ArrayList<Integer> poligono) {
        boolean alin = false;
        int temp1, temp2;
        ArrayList<Integer> lad = new ArrayList<>(poligono);
        lad.add(poligono.get(0));
        for (int i = 0; i <lad.size()-1; i++) {
            temp1=lad.get(i)-1;
            temp2=lad.get(i+1)-1;
            if(direccionBig(punt.get(temp1),punt.get(temp2),p)==0 &&
                    alineadospBig(punt.get(temp1), punt.get(temp2), p)) {
                alin = true;
                break;
            }
        }
        return alin;
    }

    static boolean pointinBig(ArrayList<ArrayList<Integer>> punt,ArrayList<BigDecimal> p,ArrayList<Integer> poligono) {
        boolean point;
        ArrayList<Integer> temp1, temp2;
        float pd0 = p.get(0).floatValue();
        float pd1 = p.get(1).floatValue();
        float valor1, valor2, valor3, valor4;
        ArrayList<BigDecimal> p1, p2;

        if(alineadospolBig(punt, p, poligono)) {
            point = true;
        }else {
            point = false;
            double suma = 0;
            for (int i = 0; i < poligono.size()-1; i++) {
                temp1 = puntos.get(poligono.get(i)-1);
                temp2 = puntos.get(poligono.get(i+1)-1);
                valor1 = temp1.get(0)-pd0;
                valor2 = temp1.get(1)-pd1;
                valor3 = temp2.get(0)-pd0;
                valor4 = temp2.get(1)-pd1;
                p1 = new ArrayList<>(Arrays.asList(new BigDecimal(valor1), new BigDecimal(valor2)));
                p2 = new ArrayList<>(Arrays.asList(new BigDecimal(valor3), new BigDecimal(valor4)));
                suma = suma + anguloBig(p1,p2);
            }
            temp1 = puntos.get(poligono.get(poligono.size()-1)-1);
            temp2 = puntos.get(poligono.get(0)-1);
            valor1 = temp1.get(0)-pd0;
            valor2 = temp1.get(1)-pd1;
            valor3 = temp2.get(0)-pd0;
            valor4 = temp2.get(1)-pd1;
            p1 = new ArrayList<>(Arrays.asList(new BigDecimal(valor1), new BigDecimal(valor2)));
            p2 = new ArrayList<>(Arrays.asList(new BigDecimal(valor3), new BigDecimal(valor4)));
            suma = suma+anguloBig(p1,p2);
            if(Math.abs(suma) >= Math.PI) {
                point = true;
            }
        }
        return point;
    }

	static boolean interseccion(ArrayList<ArrayList<Integer>> l1, ArrayList<ArrayList<Integer>> l2) {
		boolean inter = false;
		ArrayList<Integer> p1 = new ArrayList<>(l1.get(0));
		ArrayList<Integer> p2 = new ArrayList<>(l1.get(1));
		ArrayList<Integer> p3 = new ArrayList<>(l2.get(0));
		ArrayList<Integer> p4 = new ArrayList<>(l2.get(1));
		int d1 = direccion(p3, p4, p1);
		int d2 = direccion(p3, p4, p2);
		int d3 = direccion(p1, p2, p3);
		int d4 = direccion(p1, p2, p4);
		if ((!p1.get(0).equals(p3.get(0)) || !p1.get(1).equals(p3.get(1))) &&
				(!p1.get(0).equals(p4.get(0)) || !p1.get(1).equals(p4.get(1))) &&
				(!p2.get(0).equals(p3.get(0)) || !p2.get(1).equals(p3.get(1))) &&
				(!p2.get(0).equals(p4.get(0)) || !p2.get(1).equals(p4.get(1)))) {
			if (((d1 > 0 && d2 < 0) || (d1 < 0 && d2 > 0)) && ((d3 > 0 && d4 < 0) || (d3 < 0 && d4 > 0))) {
				inter = true;
			} else {
				if (d1 == 0 && alineadosp(p3, p4, p1) || d2 == 0 && alineadosp(p3, p4, p2) || d3 == 0 && alineadosp(p1, p2, p3) || d4 == 0 && alineadosp(p1, p2, p4) ) {
					inter = true;
				}
			}
		}
		return inter;
	}

	static ArrayList<BigDecimal> interseccionpBig(ArrayList<ArrayList<Integer>> l1, ArrayList<ArrayList<Integer>> l2) {
		ArrayList<Integer> u1 = new ArrayList<>();
		ArrayList<Integer> u2 = new ArrayList<>();
		ArrayList<BigDecimal> p = new ArrayList<>();
		float a, b, c, d, e, f;
		ArrayList<Integer> temp1, temp2, temp3, temp4;
		temp1 = l1.get(1);
		temp2 = l1.get(0);
		temp3 = l2.get(1);
		temp4 = l2.get(0);
		u1.add(temp1.get(0)-temp2.get(0));
		u1.add(temp1.get(1)-temp2.get(1));
		u2.add(temp3.get(0)-temp4.get(0));
		u2.add(temp3.get(1)-temp4.get(1));
		boolean coinc = u1.get(0) * u2.get(1) == u1.get(1) * u2.get(0);
		if(!coinc) {
			if(interseccion(l1, l2)) {
				a = temp1.get(1)-temp2.get(1);
				b = temp2.get(0)-temp1.get(0);
				c = (temp2.get(0)*temp1.get(1))-(temp1.get(0)*temp2.get(1));
				d = temp3.get(1)-temp4.get(1);
				e = temp4.get(0)-temp3.get(0);
				f = (temp4.get(0)*temp3.get(1))-(temp3.get(0)*temp4.get(1));
				if(temp2.get(0).equals(temp1.get(0))) {
					p.add(new BigDecimal(c/a));
					p.add(BigDecimal.valueOf((a * f - c * d) / (a * e)));
				}else {
					if(temp2.get(1).equals(temp1.get(1))) {
						p.add(BigDecimal.valueOf((b * f - c * e) / (b * d)));
						p.add(new BigDecimal(c/b));
					}else {
						p.add(BigDecimal.valueOf((b * f - c * e) / (b * d - a * e)));
						p.add(BigDecimal.valueOf((a * f - c * d) / (a * e - b * d)));
					}
				}
			}
		}else {
			p.add(new BigDecimal(temp4.get(0)));
			p.add(new BigDecimal(temp4.get(1)));
		}
		return p;
	}

	static boolean interseccionpoly(ArrayList<ArrayList<Integer>> l, ArrayList<ArrayList<Integer>> lado, ArrayList<Integer> poly) {
		ArrayList<BigDecimal> p;
		ArrayList<BigDecimal> m1 = new ArrayList<>();
		ArrayList<BigDecimal> m2 = new ArrayList<>();
		BigDecimal a, b, c;
		boolean int2 = false;
		BigDecimal eps = BigDecimal.valueOf(1 / 100000.0);
		ArrayList<Integer> temp1, temp2;
		BigDecimal temp3, temp4;
		temp1 = l.get(0);
		temp2 = l.get(1);
		if(interseccion(l, lado)) {
			p = interseccionpBig(l, lado);
			temp3 = p.get(0);
			temp4 = p.get(1);
			if (temp1.get(0).equals(temp2.get(0))) {
				m1.add(new BigDecimal(temp1.get(0)));
				m1.add(BigDecimal.valueOf(temp4.floatValue() - eps.floatValue()));
				m2.add(new BigDecimal(temp1.get(0)));
				m2.add(BigDecimal.valueOf(temp4.floatValue() + eps.floatValue()));
			} else {
				if (temp1.get(1).equals(temp2.get(1))) {
					m1.add(BigDecimal.valueOf(temp3.floatValue() - eps.floatValue()));
					m1.add(new BigDecimal(temp1.get(1)));
					m2.add(BigDecimal.valueOf(temp3.floatValue() + eps.floatValue()));
					m2.add(new BigDecimal(temp1.get(1)));
				} else {
					a = new BigDecimal(temp2.get(1) - temp1.get(1));
					b = new BigDecimal(temp1.get(0) - temp2.get(0));
					c = new BigDecimal((temp1.get(0) * temp2.get(1)) - (temp2.get(0) * temp1.get(1)));
					m1.add(BigDecimal.valueOf(temp3.floatValue() - eps.floatValue()));
					BigDecimal aux = BigDecimal.valueOf(temp3.floatValue() - eps.floatValue());
					BigDecimal aux2 = a.multiply(aux);
					BigDecimal aux3 = c.subtract(aux2);
					BigDecimal aux4 = aux3.divide(b, MathContext.DECIMAL128);
					m1.add(aux4);
					m2.add(BigDecimal.valueOf(temp3.floatValue() + eps.floatValue()));
					BigDecimal auxb = BigDecimal.valueOf(temp3.floatValue() + eps.floatValue());
					BigDecimal aux2b = a.multiply(auxb);
					BigDecimal aux3b = c.subtract(aux2b);
					BigDecimal aux4b = aux3b.divide(b, MathContext.DECIMAL128);
					m2.add(aux4b);
				}
			}
			if (!pointinBig(puntos, m1, poly) || !pointinBig(puntos, m2, poly)) {
				int2 = true;
			}

		}
		return int2;
	}

    static ArrayList<ArrayList<ArrayList<Integer>>> ladospol(ArrayList<ArrayList<Integer>> punt, ArrayList<Integer> poly ) {
        ArrayList<ArrayList<ArrayList<Integer>>> lad = new ArrayList<>();
        ArrayList<Integer> punto1aux;
        ArrayList<Integer> punto2aux;
        ArrayList<ArrayList<Integer>> puntosaux;
        ArrayList<Integer> temp1, temp2;
        for (int i = 0; i < poly.size()-1; i++) {
            temp1 = punt.get(poly.get(i) - 1);
            temp2 = punt.get(poly.get(i + 1) - 1);
            punto1aux = new ArrayList<>();
            punto1aux.add(temp1.get(0));
            punto1aux.add(temp1.get(1));
            punto2aux = new ArrayList<>();
            punto2aux.add(temp2.get(0));
            punto2aux.add(temp2.get(1));
            puntosaux = new ArrayList<>();
            puntosaux.add(punto1aux);
            puntosaux.add(punto2aux);
            lad.add(puntosaux);
        }
        punto1aux = new ArrayList<>();
        temp1 = punt.get(poly.get(poly.size() - 1) - 1);
        temp2 = punt.get(poly.get(0) - 1);
        punto1aux.add(temp1.get(0));
        punto1aux.add(temp1.get(1));
        punto2aux = new ArrayList<>();
        punto2aux.add(temp2.get(0));
        punto2aux.add(temp2.get(1));
        puntosaux = new ArrayList<>();
        puntosaux.add(punto1aux);
        puntosaux.add(punto2aux);
        lad.add(puntosaux);
        return lad;
    }

	static boolean interseccionpol(ArrayList<ArrayList<Integer>> l) {
		boolean int2 = false;
		ArrayList<ArrayList<ArrayList<Integer>>>  lados;
		ArrayList<ArrayList<Integer>>  s;
		ArrayList<BigDecimal> p;
		lados=ladospol(puntos,poligono);
		for (int i = 0; i <lados.size(); i++) {
			int2 = interseccionpoly(l, lados.get(i), poligono);
			if(int2) {
				break;
			}
		}
		if(!int2) {
			if(!segments.isEmpty()) {
				for (int i = 0; i < segments.size(); i++) {
					if(int2) {
						break;
					}
					int n = segments.get(i).size();
					s = new ArrayList<>();
					s.add(puntos.get(segments.get(i).get(0)-1));
					s.add(puntos.get(segments.get(i).get(n-1)-1));
					if(interseccion(l, s)) {
						p = interseccionpBig(l,s); // (1,1)
						if((direccionBig(l.get(0), s.get(0), p) != 0.0)
								&& (direccionBig(l.get(1), s.get(0), p) != 0.0)
								&& (direccionBig(l.get(0), s.get(1), p) != 0.0)
								&& (direccionBig(l.get(1), s.get(1), p) != 0.0)) {
							int2 = true;
						}
					}
				}
			}
		}
		return int2;
	}

    static ArrayList<BigDecimal> medioBig(ArrayList<Integer> p, ArrayList<Integer> q) {
        ArrayList<BigDecimal> m = new ArrayList<>();
        m.add(BigDecimal.valueOf((p.get(0) + q.get(0)) / 2.0));
        m.add(BigDecimal.valueOf((p.get(1) + q.get(1)) / 2.0));
        return m;
    }

	static ArrayList<ArrayList<Integer>> matriz(ArrayList<ArrayList<Integer>> punt) {
		ArrayList<ArrayList<ArrayList<Integer>>>  lados;
		ArrayList<ArrayList<Integer>>  matriz = new ArrayList<>();
		ArrayList<ArrayList<Integer>>  l;
		ArrayList<BigDecimal> m;
		ArrayList<Integer> temp1,temp2;
		for (int i = 0; i < punt.size(); i++) {
			ArrayList<Integer>  fila = new ArrayList<>();
			for (int j = 0; j < punt.size(); j++) {
				fila.add(0);
			}
			matriz.add(fila);
		}
		lados=ladospol(punt, poligono);
		for (int i = 0; i < punt.size()-1; i++) {
			for (int j = i+1; j < punt.size(); j++) {
				temp1 = punt.get(i);
				temp2 = punt.get(j);
				l = new ArrayList<>();
				l.add(temp1);
				l.add(temp2);
				if(lados.contains(l)) {
					matriz.get(i).set(j, 1);
				}else {
					if(!interseccionpol(l)) {
						m = medioBig(temp1,temp2);
						if(pointinBig(punt, m, poligono)) {
							matriz.get(i).set(j, 1);
						}
					}
				}
			}
		}
		for (int i = 0; i < punt.size(); i++) {
			for (int j = 0; j < punt.size(); j++) {
				matriz.get(j).set(i, matriz.get(i).get(j));
			}
		}
		return matriz;
	}

	static boolean segmentos(ArrayList<ArrayList<Integer>> punt, ArrayList<Integer> camino) {
		ArrayList<ArrayList<ArrayList<Integer>>> lad = new ArrayList<>();
		ArrayList<ArrayList<Integer>> puntos;
		ArrayList<Integer> punto1;
		ArrayList<Integer> punto2;
		ArrayList<Integer> temp1,temp2;
		for (int i = 0; i <camino.size()-1; i++) {
			temp1 = punt.get(camino.get(i) - 1);
			temp2 = punt.get(camino.get(i + 1) - 1);
			punto1 = new ArrayList<>();
			punto1.add(temp1.get(0));
			punto1.add(temp1.get(1));
			punto2 = new ArrayList<>();
			punto2.add(temp2.get(0));
			punto2.add(temp2.get(1));
			puntos = new ArrayList<>();
			puntos.add(punto1);
			puntos.add(punto2);
			lad.add(puntos);
		}
		temp1 = punt.get(camino.get(camino.size() - 1) - 1);
		temp2 = punt.get(camino.get(0) - 1);
		punto1 = new ArrayList<>();
		punto1.add(temp1.get(0));
		punto1.add(temp1.get(1));
		punto2 = new ArrayList<>();
		punto2.add(temp2.get(0));
		punto2.add(temp2.get(1));
		puntos = new ArrayList<>();
		puntos.add(punto1);
		puntos.add(punto2);
		lad.add(puntos);

		boolean seg = false;
		for (int i = 0; i < lad.size()-1; i++) {
			if (seg) {
				break;
			}
			for (int j = i; j < lad.size(); j++) {
				seg = interseccion(lad.get(i), lad.get(j));
				if (seg) {
					break;
				}
			}
		}
		return seg;
	}

    static int alineadosc(ArrayList<ArrayList<Integer>> punt, ArrayList<Integer> camino) {
        int alig = -1;
        ArrayList<Integer> temp1,temp2,temp3;
        ArrayList<Integer> cam = new ArrayList<>(camino);
        cam.add(camino.get(0));
        cam.add(camino.get(1));
        for (int i = 0; i <camino.size(); i++) {
            temp1 = punt.get(cam.get(i) - 1);
            temp2 = punt.get(cam.get(i + 1) - 1);
            temp3 = punt.get(cam.get(i + 2) - 1);
            alig = temp1.get(0) * (temp2.get(1) - temp3.get(1))
                    + temp2.get(0) * (temp3.get(1) - temp1.get(1))
                    + temp3.get(0) * (temp1.get(1) - temp2.get(1));
            if (alig == 0) {
                break;
            }
        }
        return alig;
    }

    static double GetAngleABC( ArrayList<Integer> uno,ArrayList<Integer>tres , ArrayList<Integer> dos){
        ArrayList<Integer> ab = new ArrayList<>(Arrays.asList(dos.get(0) - uno.get(0), dos.get(1) - uno.get(1)));
        ArrayList<Integer> cb = new ArrayList<>(Arrays.asList(dos.get(0) - tres.get(0), dos.get(1) - tres.get(1)));
        double dot = (ab.get(0) * cb.get(0) + ab.get(1) * cb.get(1)); // dot product
        double cross = (ab.get(0) * cb.get(1) - ab.get(1) * cb.get(0)); // cross product
        return Math.atan2(cross, dot);
    }

    static double angulo(ArrayList<Integer> u,ArrayList<Integer> v) {
        ArrayList<Integer> p3 = new ArrayList<>(Arrays.asList(0, 0));
        double angulo = 0;
        if(u.get(0)*u.get(0)+u.get(1)*u.get(1)!=0 &&
                v.get(0)*v.get(0)+v.get(1)*v.get(1) != 0) {
            angulo = GetAngleABC(u, v,p3);
        }
        return angulo;
    }

    static boolean pointin(ArrayList<ArrayList<Integer>> punt,ArrayList<Integer> p,ArrayList<Integer> poligono) {
        boolean point;
        ArrayList<Integer> temp1, temp2;
        int temp3, temp4;
        ArrayList<Integer> p1,p2;

        if(alineadospol(punt, p, poligono)) {
            point = true;
        }else {
            point = false;
            double suma = 0;
            for (int i = 0; i <poligono.size()-1; i++) {
                temp1 = puntos.get(poligono.get(i)-1);
                temp2 = puntos.get(poligono.get(i+1)-1);
                temp3 = p.get(0);
                temp4 = p.get(1);
                p1 = new ArrayList<>(Arrays.asList(temp1.get(0) - temp3, temp1.get(1) - temp4));
                p2 = new ArrayList<>(Arrays.asList(temp2.get(0) - temp3, temp2.get(1) - temp4));
                suma = suma+ angulo(p1,p2);
            }
            temp1 = puntos.get(poligono.get(poligono.size()-1)-1);
            temp2 = puntos.get(poligono.get(0)-1);
            temp3 = p.get(0);
            temp4 = p.get(1);
            p1 = new ArrayList<>(Arrays.asList(temp1.get(0) - temp3, temp1.get(1) - temp4));
            p2= new ArrayList<>(Arrays.asList(temp2.get(0) - temp3, temp2.get(1) - temp4));
            suma = suma+ angulo(p1,p2);
            if(Math.abs(suma) >= Math.PI) {
                point = true;
            }
        }
        return point;
    }

    static boolean alineadospol(ArrayList<ArrayList<Integer>> punt,ArrayList<Integer> p, ArrayList<Integer> poligono) {
        boolean alin = false;
        int temp1, temp2;
        ArrayList<Integer> lad = new ArrayList<>(poligono);
        lad.add(poligono.get(0));
        for (int i = 0; i <lad.size()-1; i++) {
            temp1 = lad.get(i)-1;
            temp2 = lad.get(i+1)-1;
            if(direccion(punt.get(temp1),punt.get(temp2),p) == 0 &&
                    alineadosp(punt.get(temp1), punt.get(temp2), p)) {
                alin = true;
                break;
            }
        }
        return alin;
    }

    static boolean SidesPoints(ArrayList<ArrayList<Integer>> punt, ArrayList<Integer> poligono, ArrayList<Integer> cont) {
		boolean int2 = false;
		if (!ppoints.isEmpty()) {
			for (int i = 0; i < cont.size(); i++) {
				int2 = (pointin(punt, punt.get(cont.get(i) - 1), poligono) &&
						!alineadospol(punt, punt.get(cont.get(i) - 1), poligono));
				if (int2) {
					break;
				}
			}
		}
		return int2;
	}

	static boolean SidesSegments(ArrayList<ArrayList<Integer>> punt,ArrayList<Integer> polig, ArrayList<ArrayList<Integer>> cont) {
		ArrayList<BigDecimal> m;
		boolean seg = false;
		if (!segments.isEmpty()) {
			for (int i = 0; i < cont.size(); i++) {
				if (seg) {
					break;
				}
				int n = cont.get(i).size();
				for (int j = 0; j < n-1; j++) {
					m = medioBig(punt.get(cont.get(i).get(j) - 1), punt.get(cont.get(i).get(j + 1) - 1));
					if (pointinBig(punt, m, polig)) {
						if (!alineadospolBig(punt, m, polig)) {
							seg = true;
							break;
						}
					}
				}
				m = medioBig(punt.get(cont.get(i).get(n-1) - 1), punt.get(cont.get(i).get(0) - 1));
				if (pointinBig(punt, m, polig)) {
					if (!alineadospolBig(punt, m, polig)) {
						seg = true;
					}
				}
			}
		}
		return seg;
	}

	static ArrayList<ArrayList<Integer>> lados(int nodo1, int nodo2, int distancia,
											   ArrayList<ArrayList<Integer>> matriz) {
		ArrayList<ArrayList<Integer>> poligono = new ArrayList<>();
		ArrayList<ArrayList<Integer>> aristas = new ArrayList<>();
		ArrayList<ArrayList<Integer>> temp = null;
		int ultimo;
		ArrayList<Integer> temp1;
		aristas.add(new ArrayList<>());
		aristas.get(0).add(nodo1);
		if (matriz.get(nodo1 - 1).get(nodo2 - 1) == 1) {
			for (int i = 0; i < distancia; i++) {
				temp = new ArrayList<>();
				for (int k = 0; k < aristas.size(); k++) {
					temp1 = aristas.get(k);
					ultimo = temp1.get(i);
					if (ultimo != nodo2) {
						for (int j = 1; j < matriz.size()+1; j++) {
							if (matriz.get(ultimo - 1).get(j - 1) == 1 && !temp1.contains(j)) {
								temp1.add(j);
								temp.add((ArrayList<Integer>) temp1.clone());
								temp1.remove(temp1.size() - 1);
							}
						}
					}
				}
				aristas.clear();
				aristas.addAll(temp);
			}
			temp.clear();
			for (int k = 0; k < aristas.size(); k++) {
				temp1 = aristas.get(k);
				if (temp1.get(distancia) == nodo2 && alineadosc(puntos, temp1) != 0
						&& !segmentos(puntos, temp1)) {
					temp.add(temp1);
				}
			}

			for (int i = 0; i < temp.size(); i++) {
				if (!SidesPoints(puntos, temp.get(i), ppoints) && !SidesSegments(puntos, temp.get(i), segments)) {
					poligono.add(temp.get(i));
				}
			}
		}
		return poligono;
	}

	static ArrayList<ArrayList<Integer>> duplicados(ArrayList<ArrayList<Integer>> poligonos) {
		ArrayList<ArrayList<Integer>> dupl = new ArrayList<>();
		ArrayList<ArrayList<Integer>> aux = new ArrayList<>();
		ArrayList<Integer> aux2 = new ArrayList<>();
		for (int i = 0; i < poligonos.size(); i++) {
			aux2.addAll(poligonos.get(i));
			Collections.sort(aux2);
			if (!aux.contains(aux2)) {
				dupl.add((ArrayList<Integer>) poligonos.get(i).clone());
				aux.add((ArrayList<Integer>) aux2.clone());
			}
			aux2.clear();
		}
		return dupl;
	}

	static ArrayList<ArrayList<Integer>> update(ArrayList<ArrayList<Integer>> poligonos, int fun) {
		ArrayList<ArrayList<Integer>> upd = new ArrayList<>();
		double maxi = 0;
		double f;
		ArrayList<Integer> temp1;
		for (int i = 0; i < poligonos.size(); i++) {
			temp1=poligonos.get(i);
			f = funcion(temp1, fun);
			if (f >= maxi) {
				upd.add(temp1);
			}
			if (f > maxi) {
				upd = new ArrayList<>();
				maxi = f;
				upd.add(temp1);
			}
		}
		return upd;
	}

	static double funcion(ArrayList<Integer> poligono, int fun) {
		double funcion = 0;
		ArrayList<Integer> temp1,temp2;
		if (fun == 0) {
			for (int i = 1; i < poligono.size(); i++) {
				temp1 = puntos.get(poligono.get(i - 1) - 1);
				temp2 = puntos.get(poligono.get(i) - 1);
				funcion = funcion + ((temp1.get(0) * temp2.get(1)) - (temp2.get(0) * temp1.get(1)));
			}
			temp1 = puntos.get(poligono.get(poligono.size() - 1) - 1);
			temp2 = puntos.get(poligono.get(0) - 1);
			funcion = funcion + ((temp1.get(0) * temp2.get(1)) - (temp2.get(0) *temp1.get(1)));
			funcion = Math.abs(0.5 * funcion);
		}
		if (fun == 1) {
			for (int i = 1; i < poligono.size(); i++) {
				temp1 = puntos.get(poligono.get(i - 1) - 1);
				temp2 = puntos.get(poligono.get(i) - 1);
				funcion = (funcion + Math.sqrt(Math
						.pow(temp1.get(1) - temp2.get(1), 2)
						+ Math.pow(temp1.get(0) - temp2.get(0),
						2)));
			}
			temp1 = puntos.get(poligono.get(poligono.size() - 1) - 1);
			temp2 = puntos.get(poligono.get(0) - 1);
			funcion = (funcion + Math.sqrt(Math
					.pow(temp1.get(1) - temp2.get(1), 2)
					+ Math.pow(temp1.get(0) - temp2.get(0),
					2)));
			funcion = Math.round(funcion * 10000000000.0) / 10000000000.0;
		}
		return funcion;
	}

    static ArrayList<ArrayList<Integer>> poligonos(int nodos, int distancia, ArrayList<ArrayList<Integer>> matriz,
                                                   int fun) {
        ArrayList<ArrayList<Integer>> pol = new ArrayList<>();
        ArrayList<ArrayList<Integer>> poligonos = new ArrayList<>();
        ArrayList<ArrayList<Integer>> aux;
        for (int i = 0; i < nodos-1; i++) {
            for (int j = i + 1; j < nodos+1; j++) {
                aux = lados(i + 1, j, distancia, matriz);
                pol = (ArrayList<ArrayList<Integer>>) union(aux, pol);
            }
        }
        poligonos = duplicados(update(pol, fun));

        return poligonos;
    }

	static public <T> List<T> union(ArrayList<T> list1, ArrayList<T> list2) {
		Set<T> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(list2);
		return new ArrayList<>(set);
	}
}