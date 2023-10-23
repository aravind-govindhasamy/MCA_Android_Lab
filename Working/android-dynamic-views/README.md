Dynamically remove and add views in Android
===
This sample project achieves exactly the same functionality and look as the edit UI in the stock Android contact app (or "People"), where you can remove a row field view by pressing the "x" icon on the right, and add a row field view by pressing the "Add new" button at the bottom. 

The example also handles some visibility logic for better UX as in the stock app: If a row becomes empty, "add new" and "x" will disappear. 

Key methods and classes used 
---
TextWatcher, setVisibility, inflate, addView, removeView, animateLayoutChanges


TODO
---
State is not saved for rotation, maybe adding it later.