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
