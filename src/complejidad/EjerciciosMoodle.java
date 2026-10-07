package complejidad;

public class EjerciciosMoodle {
	
//	A continuación se plantea una serie de métodos escritos en Java. Para cada uno de ellos se pide indicar su orden de complejidad justificando el mismo con palabras y/o lenguaje matemático.
//
//	En cada ejercicio se debe indicar y justificar cual es:
//
//	la entrada
//	el tamaño de la entrada
//	la función de complejidad
//	el orden de complejidad del algoritmo
//	Se asume que todos los enteros pasados como parámetros son positivos y los arreglos, no vacíos.
//
//	1. El siguiente método cambia los números del arreglo que son menores a la mitad del maximo.

	public static void cambiarNumeros(int[] a) {
	   for(int i = 0; i<a.length; i++) {							//2n +1
	      int max = a[0];											//1					}
	      for (int j = 0; j < a.length; j++) {						//2n +1				}
	         if (a[j] > max) {										//1		}			}
	            max = a[j];											//1		} * n		}
	         }														//					} * n
	      }															//					}		
	      if (a[i] < max/2) {										//1					}
	         a[i]= max/2;											//1					}
	      }
	   }
	}
	
	// f(n) = 2n + 1 + n( 1 + 2n + 1 + n(1+ 1) + 1 + 1)
	// f(n) = 4n^2 + 6n + 1
	
//	entrada: Arreglo de enteros a
//	tamaño de la entrada: a.length
//	función de complejidad: 4n^2 + 6n + 1
//	orden de complejidad: f pertenece a O(n^2)
	
	

//	¿Cómo se podría modificar el método para que tenga una complejidad mejor?
	
	public static void cambiarNumerosMejorado(int[] a) {
	   int max = a[0];												//1
	   for (int j = 0; j < a.length; j++) {							//2n + 1
	      if (a[j] > max) {											//1		}
	         max = a[j];											//1		} * n
	      }
	   }
	   for(int i = 0; i<a.length; i++) {							//2n +1	
	      if (a[i] < max/2) {										//1		}
	         a[i]= max/2;											//1		} * n			
	      }
	   }
	}
	
	// f(n) = 1 + 2n + 1 + n( 1 + 1) + 2n + 1 + n( 1 + 1)
	// f(n) = 8n + 3
	
	//	orden de complejidad: f pertenece a O(n

//	2. El siguiente método indica si la posición m pertenece al arreglo a:

	public static boolean pertenecePosicion(int[] a, int m) {
	   for(int i = 0; i < a.length; i++) {							//2n + 1
	      a[i] = 0;													//1		}
	      if (i == m) {												//1		} * n
	         return true;											//1		}
	      }
	   }
	   return false;												//1
	}
	
	
	// f(n) = 2n + 1 + n( 1 + 1 +1 ) + 1
	// f(n) = 5n + 2
	
//	entrada: Arreglo de enteros a
//	tamaño de la entrada: a.length
//	función de complejidad:  f(n) = 5n + 2
//	orden de complejidad: f pertenece a O(n)

//	3. El siguiente método usa bloques de código de los cuales solo conocemos su complejidad:

	public static void funcionBloques(int[] a) {
	   int n = a.length;											//1
	   int i = 1;													//1										
	   while (i < n-20){											//n-20
	      /*
	       bloque de código de orden O(log n) 						//O(log n)		}
	      */														//				} * (n-20)
	      i++;														//1				}
	   }
	   while(i < n){												//20 
	      /*
	       bloque de código de orden O(n) 							//O(n)			}
	      */														//				} * 20
	      i++;														//1     		}
	   }
	}
	
	
	// f(n) = 1 + 1 + n - 20 + (n - 20) * (O(log(n) + 1)) + 20 + 20 *(O(n) + 1) 
	// f(n) = 1 + 1 + n - 20 + O(n*log(n) + n + O(log(n) - 20  + 20 + O(n) + 20 
	
//	entrada: Arreglo de enteros a
//	tamaño de la entrada: a.length
//	función de complejidad:  f(n) = 1 + 1 + n - 20 + O(n*log(n) + n + O(log(n) - 20  + 20 + O(n) + 20 
//	orden de complejidad: f pertenece a O(n*log(n))



}
