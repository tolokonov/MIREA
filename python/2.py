import math

def 12(x):
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
