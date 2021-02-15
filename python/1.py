import math
def f11(x, y):
  return x**4 + math.sin(y) - 56 + 77 * x**5 + math.fabs(x) - math.sqrt((x + 33 * x**2) / (y**4 - math.sin(x)))

def f12(x):
  if (x < -34):
    return x**3 + 24 * x - 51
  elif (x >= -34 and x < 46):
    return math.exp(x-math.log(x)) + math.cos(math.log(x))
  elif (x >= 46 and x < 62):
    return 62 * (math.log(x) - x**7 + 80)**5 + math.log(x)
  elif (x >= 62 and x < 91):
    return 92 * (67 * x**8 + math.fabs(x) + 32) + math.tan(x)
  else:
    return x**8 + math.log(x) + 24
  
def f13(n, m):
  result = 0
  i = 1
  j = 1
  for i in range(1, n+1):
    for j in range(1, m+1):
      result += (j**7 + i**3 / 66 + 36)
  result *= 90
  for i in range (1, n+1):
    for j in range(1, m+1):
      result += 90 * i**3 + math.exp(i)
  return result  

def f14(n):
  if (n==0):
    return 5
  return math.tan(14(n-1)) + math.tan(14(n-1)) - 61
