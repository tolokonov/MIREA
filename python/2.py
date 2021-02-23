def f21(x):
  if x[3] == 1964:
    if x[1] == 'qmake':
      if x[0] == 2006:
        return 0
      else:
        return 1
    elif x[1] == 'cuda':
      return 2
    else:
      if x[2] == 'c++':
        return 3
      elif x[2] == 'numpy':
        return 4
      else:
        return 5
  elif x[3] == 1960:
    return 6
  else:
    if x[2] == 'c++':
        return 7
    elif x[2] == 'numpy':
      if x[0] == 2006:
        return 8
      else:
        return 9
    else:
      return 10

def swapBits(x, p1, p2, n):
  set1 =  (x >> p1) & ((1 << n) - 1)
  set2 =  (x >> p2) & ((1 << n) - 1)
 
  xor = (set1 ^ set2)
  xor = (xor << p1) | (xor << p2)

  result = x ^ xor
  return result
 
def f22(x):
  res = swapBits(x, 0, 16, 16)
  res = swapBits(res, 12, 16, 4)
  res = swapBits(res, 16, 20, 4)
  res = swapBits(res, 20, 24, 4)
  res = swapBits(res, 24, 28, 4)
  return hex(res)

def f23(a):
  new_a = []
  [new_a.append(item) for item in a if item not in new_a]

  new_b = []
  new_c = []
  for item in new_a:
    for item_1 in item:
      if item_1 != 'None':
        new_b.append(item_1)
    new_c.append(new_b)
    new_b = []    
  
  for i in range(len(new_c[0])):
    new_a = []
    for item in new_c:
      new_a.append(item[i])
    new_b.append(new_a)
  new_a = []
  [new_a.append(item) for item in new_b if item not in new_a]

  for i in range(len(new_a[0])):
    if new_a[0][i] == 'Y':
      new_a[0][i] = 'true'
    else:
      new_a[0][i] = 'false'

  for i in range(len(new_a[1])):
    new_a[1][i] = new_a[1][i].replace('[at]', '@')

  for i in range(len(new_a[2])):
    new_a[2][i] = new_a[2][i][4:7] + new_a[2][i][8:]

  for i in range(len(new_a[3])):
    new_a[3][i] = new_a[3][i].replace('%', '')
    temp = float(new_a[3][i]) / 100.0
    new_a[3][i] = str(round(temp, 1))
  return new_a
