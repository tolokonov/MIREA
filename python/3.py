import math
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