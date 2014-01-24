Timemory
===========

A geovisualization software writting in Java. The previous processing version has been deprecated.
This is a course project in AME 598 Media Synthesis

[Preface]:

In 2011 summer, I completed a US round trip myself. I took amtrak trains, greyhound buses,
subways, and also walked. I am a big fun of documentation. As a result, I also managed to
'document' my very great trip:
1. Use Google Latitude in my iPad2 to track where I‘ve been to.
2. Use Evernote and my notebook to write up what I was thinking about.
3. Use Camera to capture what I've seen.

After the trip, many friends asked me to tell the stories happened during this adventure.
Then I came out an idea - why not create something to tell stories in an engaging and
unique way? Also, why not create something that helps me recall this piece of memory?

This is how this creature was generated.

[What is Timemory?]
Timemory is an interactive trip data tool that helps users visualize their check-in
locations, pictures and travel diaries in an engaging manner.

In this software, users can upload their trip data and visualize the locations, pictures
 and texts in a story-telling way. Users can control the story flow by using mouse and
 keyboard. Also, the software can also generate a flash file so that users can use it for
 presentation.

This tool is developed using Java & processing because it might be the simplest tool
for non-artist to create good-looking and fancy staff.

------------------------------------------------------------------------------------------
[How to collect data?]
Use 'google location service'. Enable it in your android or iOS devices, and get location
history data from http://maps.google.com/locationhistory/
For texts, save all of dairies into *.txt files so that we can process.
For pictures, use exiftool to export camera exif ata to *.txt files. If the pictures are
taken by mobile devices, they should have GPS data, if not, the software can tag each
picture a GPS location based on the timestamp matching tool.

[What I have right now.]
It cannot render pictures and texts right now. Instead, it renders each picture and text
as points and show their summarized data.

