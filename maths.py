shape = input('Please enter the shape you want to calculate the area of: ')
width = float(input('Please enter the width of your %s: ' %(shape )))
height = float(input('Please enter the height of your %s: ' %(shape )))
area = width  * height
perimeter = 2 * (width + height)
print('Your %s area is: %s' %(shape, area))
print('Your %s perimeter is: %s' %(shape, perimeter))